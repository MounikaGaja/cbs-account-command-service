package com.ubi.dbp.proxy.cbs.user.service.model.customer;

import dbp.framework.proxy.cbs.common.CBSRequest;
import dbp.framework.proxy.cbs.common.util.XMLBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AIFRequest implements CBSRequest{
	public final static String xmlTag = "executeFinacleScriptRequest";
	
	private AccountInfo customerInfoDetails;
	
	
	public String buildXML() {
		return new XMLBuilder()
				.element("executeFinacleScriptRequest"    )
				.element("ExecuteFinacleScriptInputVO"    )
				.element("requestId","ApiLoanWorkFlowLAS2FIN.scr")
				.endelement()
				.element("executeFinacleScript_AccountData"    )
				.addXML(customerInfoDetails.buildXML())
				.endelement()
				.endelement()	
				.printXML();
	}

	@Override
	public String xmlTag() {
		return xmlTag; 
	}


}
