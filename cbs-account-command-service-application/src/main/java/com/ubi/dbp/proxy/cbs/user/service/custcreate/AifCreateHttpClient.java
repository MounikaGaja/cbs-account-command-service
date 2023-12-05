package com.ubi.dbp.proxy.cbs.user.service.custcreate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFRequest;
import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFResponse;

import dbp.framework.proxy.cbs.common.AbstractCBSHttpClient;
import dbp.framework.proxy.cbs.common.config.CbsURLConfig;
import dbp.framework.proxy.common.client.DbpHttpClient;

@Component
public class AifCreateHttpClient 
			extends AbstractCBSHttpClient<AIFRequest,AIFResponse>{

	
	@Autowired
	AIFCreateReqDocument aifCreateReqDocument;

	@Autowired
	AIFCreateRespParser aifCreateRespParser;

	
	@Autowired
	CbsURLConfig  cbsURLConfig;
	
	@Autowired
	DbpHttpClient dbpHttpClient;

	@Override
	public AIFCreateRespParser getParser() {
		return aifCreateRespParser;
	}

	@Override
	public AIFCreateReqDocument getRequestDocument() {
		return aifCreateReqDocument;
	}
	
	@Override
	protected String getConnectionURL() {
		return cbsURLConfig.getUrl();
	}

	@Override
	protected DbpHttpClient getDbpHttpClient() {
		return dbpHttpClient;
	}
	
	
	
}
