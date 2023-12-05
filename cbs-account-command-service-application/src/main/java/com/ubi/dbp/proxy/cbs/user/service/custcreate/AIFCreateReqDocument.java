package com.ubi.dbp.proxy.cbs.user.service.custcreate;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import dbp.framework.proxy.cbs.common.AbstractRequestDocument;
import jakarta.annotation.PostConstruct;




@Component
public class AIFCreateReqDocument extends AbstractRequestDocument {

	@Value("${aifcreate.reqTemplate}")
	protected String reqTemplate;
	
	
	@Value("#{${aifcreate.fields}}")
	private String fields;

    @PostConstruct
    public void init() {
    	super.init();
    }

	@Override
	public String getReqTemplate() {
		return reqTemplate;
	}

	@Override
	public Map<String, String> getFields() {
		Map<String, String> resMap =new HashMap<>(); 
		resMap.put("executeFinacleScriptRequest", fields);
		return resMap;
	}
	
}
