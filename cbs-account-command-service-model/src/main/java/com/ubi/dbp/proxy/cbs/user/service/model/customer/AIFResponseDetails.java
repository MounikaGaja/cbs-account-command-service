package com.ubi.dbp.proxy.cbs.user.service.model.customer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Getter
@Setter
public class AIFResponseDetails {
	
	private String cifID; 
	private String successOrFailure; 
	private String resultMessage; 
	private String loanAccountNo;

}
