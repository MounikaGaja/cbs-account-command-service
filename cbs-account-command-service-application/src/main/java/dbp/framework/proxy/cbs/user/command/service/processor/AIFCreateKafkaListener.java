package dbp.framework.proxy.cbs.user.command.service.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.requestreply.CorrelationKey;

import com.ubi.dbp.proxy.cbs.user.service.apl.AIFCreateServiceImpl;
import com.ubi.dbp.proxy.cbs.user.service.apl.AifCreateService;
import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFRequest;
import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFResponse;
import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFResponseDetails;

import dbp.framework.support.spring.kafka.consumer.AbstractReplyKafkaListener;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AIFCreateKafkaListener extends AbstractReplyKafkaListener<AIFRequest , AIFResponse>{
	
	private static Logger log = LoggerFactory.getLogger(AIFCreateKafkaListener.class);
	
	@Autowired
	AifCreateService aifCreateService;
	
	private String correlationId;
    @KafkaListener(id = "${kafka-consumer-group-config.user-command-service-group-id}",	topics = "${user-command.aifcreate-topic}")
	@SendTo
	public String listen(@Payload String message,
	        @Header(KafkaHeaders.RECEIVED_KEY) String key,
	        @Header(KafkaHeaders.RECEIVED_PARTITION) Integer partition,
	        @Header(KafkaHeaders.OFFSET) Long offset,
	        @Header(KafkaHeaders.REPLY_TOPIC) String replyTopic,
	        @Header(KafkaHeaders.CORRELATION_ID) byte[] correlationId
			) {
    	log.info("Received Key: {}, Partion: {}, Offset: {}, Reply Topic: {}, Correlation Id: {}, Message: {}",
				key,partition,offset,replyTopic, new CorrelationKey(correlationId), message);
		return receive(message);
	}

	

	@Override
	protected Class<AIFRequest> getClazz() {
		return AIFRequest.class;
	}

	
	@Override
	public AIFResponse receive(AIFRequest req) {
		
		log.debug("Processing data for user id: {} and User: ", req );
		//CIFResponseDetails details= new CIFResponseDetails();
		AIFResponse response =null ;
		try {
			
			
			 response= aifCreateService.createAif(req);
			
		} catch (Exception e) {
			log.error("Error while creating td account", e);
		}
		return response;
	}


}
