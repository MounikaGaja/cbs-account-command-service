package com.ubi.dbp.proxy.cbs.user.service.custcreate;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFResponse;

import dbp.framework.proxy.cbs.common.AbstractCBSParser;

@Component
public class AIFCreateRespParser 
			extends AbstractCBSParser<AIFResponse>{
	@Value("${cifcreate.resp.baseNodePath}")
	private String baseNodePath;

	public String getBaseNodePath() {
		return baseNodePath;
	}
	
	@Override
	protected AIFResponse getInstance() {
		 return AIFResponse.builder().build();
	}
	@Override
	public Class<AIFResponse> getClazz() {
			return AIFResponse.class;
	}
	
}
