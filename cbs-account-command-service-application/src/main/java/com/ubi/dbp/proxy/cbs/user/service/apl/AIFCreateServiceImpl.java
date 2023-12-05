package com.ubi.dbp.proxy.cbs.user.service.apl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubi.dbp.proxy.cbs.user.service.custcreate.AifCreateHttpClient;
import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFRequest;
import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service( "aifCreateService")
public class AIFCreateServiceImpl implements AifCreateService {
	
	
	private static Logger log = LoggerFactory.getLogger(AIFCreateServiceImpl.class);
	@Autowired 
	AifCreateHttpClient aifCreateHttpClient;
	
	@Override
	public AIFResponse createAif(AIFRequest aifRequest) {
		log.debug("AIFCreateServiceImpl::createAif:: request is created");
		AIFResponse response = aifCreateHttpClient.handleRequest(aifRequest);
		log.debug("AIFCreateServiceImpl::createAif: response completed ");
		return response;
	}

	
	


}
