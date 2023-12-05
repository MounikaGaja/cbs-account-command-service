package com.ubi.dbp.proxy.cbs.user.service.model.customer;



import org.apache.commons.lang3.StringUtils;

import dbp.framework.proxy.cbs.common.util.XMLBuilder;


public class AccountInfo {

		private String loanId;
	    private String solId;
	    private String custId;
	    private String glSubheadCode;
	    private String schemeCode;
	    private String schmType;
	    private String custTitle;
	    private String custName;
	    private String custStatus;
	    private String custOccupation;
	    private String constitution;
	    private String gender;
	    private String addrType;
	    private String addr;
	    private String city;
	    private String state;
	    private String postalCode;
	    private String communityCode;
	    private String casteCode;
	    private String taxslab;
	    private String operationMode; 
	    private String loanAmt;
	    private String loanFrequency;
	    private String loanPeriod;
	    private String paymentMethod;
	    private String operatingAccount;
	    private String noOfFlows;
	    private String loanStartDate;
	    private String sectorCode;
	    private String purposeOfAdvance;
	    private String natureOfAdvance;
	    private String subSectorCode;
	    private String exServiceman;
	    private String physicallyHandicapped;
	    private String freeCode6;
	    private String freeCode7;
	    private String sanctionLevel;
	    private String sanctionAuthority;
	    private String sanctionRefNo;
	    private String sanctionDate;
	    private String limitExpiryDate; 
	    private String documentDate;
	    private String drawingPwrInd;
	    private String interestRate;
	    private String loanAccountNo; 
	    private String facilitySrlNo; 
	    private String addrs2;
	    private String borrowerCode; 
	    private String modeOfAdvance; 
	    private String typeOfAdvance;
	    private String industryType;
	    private String occupation; 
	    private String panNumber;
	    private String dateOfBirth; 
	    private String custEmployeeNumber;
	    private String maritalStatus;
	    private String countryCode; 
	    private String acctLabelCode;
	    private String isCorporate; 
	    private String custOccpCode; 
	    private String annualIncome;
	    private String countryResidence;
	    private String form60_61;
	    private String form60_61_Ref; 
	    private String idProof;
	    private String idProofRef; 
	    private String resProofType;
	    private String resIdReference;
	    private String sourceOfIncome;
	    private String networth;
	    private String annualTurnover;
	    private String annualTurnoverEst;
	    private String pooledAccount;
	    private String activityType;
	    private String ofac;
	    private String foreignIWRemittance;
	    private String remitCountryCode;
	    private String clientName1;
	    private String clientLocation1;
	    private String clientCityCode1;
	    private String clientCountryCode1;
	    private String clientName2;
	    private String clientLocation2;
	    private String clientCityCode2;
	    private String clientCountryCode2;
	    private String clientName3;
	    private String clientLocation3;
	    private String clientCityCode3;
	    private String clientCountryCode3;
	    private String riskCategory;
	    private String customerType;
	    private String healthCode;
	    private String freeCode5;
	    private String hashCode;
	    private String sleepingPartner;
	    private String politicalExposed;
	    private String familyShare;
	    private String villageCode;
	    private String commDate;
	    private String revCommDate;
	    private String guardianCode;
	    private String guardianName;
	    private String applicantMobile;
	    private String applicantEmail;
	    private String applicationProcessFees;
	    private String margin;
	    private String networthValue;
	    private String rating;
	    private String ratingDate;
	    private String fatca_dec_flg;
	    private String fatherName;
	    private String fatcaFlg;
	    private String birthPlace;
	    private String birthCntry;
	    private String fatcaNationality;
	    private String spouseName;
	    private String cntryTaxRes1;
	    private String tin1;
	    private String tinCntry1;
	    private String docColDt1;
	    private String cntryTaxRes2;
	    private String tin2;
	    private String tinCntry2;
	    private String docColDt2;
	    private String tin3;
	    private String tinCntry3;
	    private String docColDt3;
	    private String cntryTaxRes3;
	    private String remarks;
	    private String deviationChargesFlag;
	    private String interestDefferedDate;
	    private String cibil;
	    private String processingFee;
	    private String expiryDate;
	    private String goldType;
	    private String goldpouch;
	    private String mutProp;
	    private String udinflg;
	    private String udinnum;
	    private String csaCode;
	    private String dealerName;
	    private String dealerNumber;
	    private String dealerIFSC;
	    private String marginAmt;
	    private String advPaid;
	    private String blanck;
	    private String msgid;
	    private String freeCode8;
	    private String cgtsmeCode;
	    private String intTblCodeApi;
	    private String acctPrefInt;
	    private String userId;
	    private String freeCode1;
	    private String freeCode2;
	    private String freeCode3;
	    private String freeCode4;
	    private String freeCode9;
	    private String freeCode10;
	    private String projectCost;
	    private String location;
	    private String colenderDetails;
	    private String invstmtInPlantMachine;
	    private String turnOver;
	
	public final static String xmlTag = "executeFinacleScript_AccountData";
	public String buildXML() {
		return new XMLBuilder().element(xmlTag)
				.element("loanId", StringUtils.isNotBlank(loanId)?loanId:"")
				.element("SolId", StringUtils.isNotBlank(solId)?solId:"")
				.element("custId", StringUtils.isNotBlank(custId)?custId:"")
				.element("glSubheadCode", StringUtils.isNotBlank(glSubheadCode)?glSubheadCode:"")
				.element("schemeCode", StringUtils.isNotBlank(schemeCode)?schemeCode:"")
				.element("schmType", StringUtils.isNotBlank(schmType)?schmType:"")
				.element("custTitle", StringUtils.isNotBlank(custTitle)?custTitle:"")
				.element("custName", StringUtils.isNotBlank(custName)?custName:"")
				.element("custStatus", StringUtils.isNotBlank(custStatus)?custStatus:"")
				.element("custOccupation", StringUtils.isNotBlank(custOccupation)?custOccupation:"")
				.element("constitution", StringUtils.isNotBlank(constitution)?constitution:"")
				.element("gender", StringUtils.isNotBlank(gender)?gender:"")
				.element("addrType", StringUtils.isNotBlank(addrType)?addrType:"")
				.element("addr", StringUtils.isNotBlank(addr)?addr:"")
				.element("city", StringUtils.isNotBlank(city)?city:"")
				.element("state", StringUtils.isNotBlank(state)?state:"")
				.element("postalCode", StringUtils.isNotBlank(postalCode)? postalCode:"")
				.element("communityCode", StringUtils.isNotBlank(communityCode)?communityCode:"")
				.element("casteCode", StringUtils.isNotBlank(casteCode)?casteCode:"")
				.element("taxslab", StringUtils.isNotBlank(taxslab)?taxslab:"")
				.element("operationMode ", StringUtils.isNotBlank(operationMode )?operationMode :"")
				.element("loanAmt", StringUtils.isNotBlank(loanAmt)?loanAmt:"")
				.element("loanFrequency", StringUtils.isNotBlank(loanFrequency)?loanFrequency:"")
				.element("loanPeriod", StringUtils.isNotBlank(loanPeriod)?loanPeriod:"")
				.element("paymentMethod", StringUtils.isNotBlank(paymentMethod)?paymentMethod:"")
				.element("operatingAccount", StringUtils.isNotBlank(operatingAccount)?operatingAccount:"")
				.element("noOfFlows", StringUtils.isNotBlank(noOfFlows)?noOfFlows:"")
				.element("loanStartDate", StringUtils.isNotBlank(loanStartDate)?loanStartDate:"")
				.element("sectorCode", StringUtils.isNotBlank(sectorCode)?sectorCode:"")
				.element("purposeOfAdvance", StringUtils.isNotBlank(purposeOfAdvance)?purposeOfAdvance:"")
				.element("natureOfAdvance", StringUtils.isNotBlank(natureOfAdvance)?natureOfAdvance:"")
				.element("subSectorCode", StringUtils.isNotBlank(subSectorCode)?subSectorCode:"")
				.element("exServiceman", StringUtils.isNotBlank(exServiceman)?exServiceman:"")
				.element("physicallyHandicapped", StringUtils.isNotBlank(physicallyHandicapped)?physicallyHandicapped:"")
				.element("freeCode6", StringUtils.isNotBlank(freeCode6)?freeCode6:"")
				.element("freeCode7", StringUtils.isNotBlank(freeCode7)?freeCode7:"")
				.element("sanctionLevel", StringUtils.isNotBlank(sanctionLevel)?sanctionLevel:"")
				.element("sanctionAuthority", StringUtils.isNotBlank(sanctionAuthority)?sanctionAuthority:"")
				.element("sanctionRefNo", StringUtils.isNotBlank(sanctionRefNo)?sanctionRefNo:"")
				.element("sanctionDate", StringUtils.isNotBlank(sanctionDate)?sanctionDate:"")
				.element("limitExpiryDate", StringUtils.isNotBlank(limitExpiryDate)?limitExpiryDate:"")
				.element("documentDate", StringUtils.isNotBlank(documentDate)?documentDate:"")
				.element("drawingPwrInd", StringUtils.isNotBlank(drawingPwrInd)?drawingPwrInd:"")
				.element("interestRate", StringUtils.isNotBlank(interestRate)?interestRate:"")
				.element("loanAccountNo ", StringUtils.isNotBlank(loanAccountNo )?loanAccountNo :"")
				.element("facilitySrlNo ", StringUtils.isNotBlank(facilitySrlNo )?facilitySrlNo :"")
				.element("addrs2", StringUtils.isNotBlank(addrs2)?addrs2:"")
				.element("borrowerCode ", StringUtils.isNotBlank(borrowerCode )?borrowerCode :"")
				.element("modeOfAdvance ", StringUtils.isNotBlank(modeOfAdvance )?modeOfAdvance :"")
				.element("typeOfAdvance", StringUtils.isNotBlank(typeOfAdvance)?typeOfAdvance:"")
				.element("industryType ", StringUtils.isNotBlank(industryType )?industryType :"")
				.element("occupation", StringUtils.isNotBlank(occupation)?occupation:"")
				.element("panNumber", StringUtils.isNotBlank(panNumber)?panNumber:"")
				.element("dateOfBirth", StringUtils.isNotBlank(dateOfBirth)?dateOfBirth:"")
				.element("custEmployeeNumber", StringUtils.isNotBlank(custEmployeeNumber)?custEmployeeNumber:"")
				.element("maritalStatus", StringUtils.isNotBlank(maritalStatus)?maritalStatus:"")
				
				.element("countryCode ", StringUtils.isNotBlank(countryCode )?countryCode :"")
				.element("acctLabelCode", StringUtils.isNotBlank(acctLabelCode)?acctLabelCode:"")
				.element("isCorporate ", StringUtils.isNotBlank(isCorporate )?isCorporate :"")
				.element("custOccpCode ", StringUtils.isNotBlank(custOccpCode )?custOccpCode :"")
				.element("annualIncome", StringUtils.isNotBlank(annualIncome)?annualIncome:"")
				.element("countryResidence", StringUtils.isNotBlank(countryResidence)?countryResidence:"")
				.element("form60_61", StringUtils.isNotBlank(form60_61)?form60_61:"")
				.element("form60_61_Ref ", StringUtils.isNotBlank(form60_61_Ref )?form60_61_Ref :"")
				.element("idProof", StringUtils.isNotBlank(idProof)?idProof:"")
				.element("idProofRef", StringUtils.isNotBlank(idProofRef)?idProofRef:"")
				.element("resProofType", StringUtils.isNotBlank(resProofType)?resProofType:"")
				.element("resIdReference", StringUtils.isNotBlank(resIdReference)?resIdReference:"")
				.element("sourceOfIncome", StringUtils.isNotBlank(sourceOfIncome)?sourceOfIncome:"")
				.element("networth", StringUtils.isNotBlank(networth)?networth:"")
				.element("annualTurnover", StringUtils.isNotBlank(annualTurnover)?annualTurnover:"")
				.element("annualTurnoverEst", StringUtils.isNotBlank(annualTurnoverEst)?annualTurnoverEst:"")
				.element("pooledAccount", StringUtils.isNotBlank(pooledAccount)?pooledAccount:"")
				.element("activityType", StringUtils.isNotBlank(activityType)?activityType:"")
				.element("ofac", StringUtils.isNotBlank(ofac)?ofac:"")
				.element("foreignIWRemittance", StringUtils.isNotBlank(foreignIWRemittance)?foreignIWRemittance:"")
				.element("remitCountryCode", StringUtils.isNotBlank(remitCountryCode)?remitCountryCode:"")
				.element("clientName1", StringUtils.isNotBlank(clientName1)?clientName1:"")
				.element("clientLocation1", StringUtils.isNotBlank(clientLocation1)?clientLocation1:"")
				.element("clientCityCode1", StringUtils.isNotBlank(clientCityCode1)?clientCityCode1:"")
				.element("clientCountryCode1", StringUtils.isNotBlank(clientCountryCode1)?clientCountryCode1:"")
				.element("clientName2", StringUtils.isNotBlank(clientName2)?clientName2:"")
				.element("clientLocation2", StringUtils.isNotBlank(clientLocation2)?clientLocation2:"")
				.element("clientCityCode2", StringUtils.isNotBlank(clientCityCode2)?clientCityCode2:"")
				.element("clientCountryCode2", StringUtils.isNotBlank(clientCountryCode2)?clientCountryCode2:"")
				.element("clientName3", StringUtils.isNotBlank(clientName3)?clientName3:"")
				.element("clientLocation3", StringUtils.isNotBlank(clientLocation3)?clientLocation3:"")
				.element("clientCityCode3", StringUtils.isNotBlank(clientCityCode3)?clientCityCode3:"")
				.element("clientCountryCode3", StringUtils.isNotBlank(clientCountryCode3)?clientCountryCode3:"")
				.element("riskCategory", StringUtils.isNotBlank(riskCategory)?riskCategory:"")
				.element("customerType", StringUtils.isNotBlank(customerType)?customerType:"")
				.element("healthCode", StringUtils.isNotBlank(healthCode)?healthCode:"")
				.element("freeCode5", StringUtils.isNotBlank(freeCode5)?freeCode5:"")
				.element("hashCode", StringUtils.isNotBlank(hashCode)?hashCode:"")
				.element("sleepingPartner", StringUtils.isNotBlank(sleepingPartner)?sleepingPartner:"")
				.element("politicalExposed", StringUtils.isNotBlank(politicalExposed)?politicalExposed:"")
				.element("familyShare", StringUtils.isNotBlank(familyShare)?familyShare:"")
				.element("villageCode", StringUtils.isNotBlank(villageCode)?villageCode:"")
				.element("commDate", StringUtils.isNotBlank(commDate)?commDate:"")
				.element("revCommDate", StringUtils.isNotBlank(revCommDate)?revCommDate:"")
				.element("guardianCode", StringUtils.isNotBlank(guardianCode)?guardianCode:"")
				.element("guardianName", StringUtils.isNotBlank(guardianName)?guardianName:"")
				.element("applicantMobile", StringUtils.isNotBlank(applicantMobile)?applicantMobile:"")
				.element("applicantEmail", StringUtils.isNotBlank(applicantEmail)?applicantEmail:"")
				.element("applicationProcessFees", StringUtils.isNotBlank(applicationProcessFees)?applicationProcessFees:"")
				.element("margin", StringUtils.isNotBlank(margin)?margin:"")
				.element("networthValue", StringUtils.isNotBlank(networthValue)?networthValue:"")
				.element("rating", StringUtils.isNotBlank(rating)?rating:"")
				.element("ratingDate", StringUtils.isNotBlank(ratingDate)?ratingDate:"")
				//.element("fatcaDecFlg", StringUtils.isNotBlank(fatcaDecFlg)?fatcaDecFlg:"")
				.element("fatherName", StringUtils.isNotBlank(fatherName)?fatherName:"")
				.element("fatcaFlg", StringUtils.isNotBlank(fatcaFlg)?fatcaFlg:"")
				.element("birthPlace", StringUtils.isNotBlank(birthPlace)?birthPlace:"")
				.element("birthCntry", StringUtils.isNotBlank(birthCntry)?birthCntry:"")
				.element("fatcaNationality", StringUtils.isNotBlank(fatcaNationality)?fatcaNationality:"")
				.element("spouseName", StringUtils.isNotBlank(spouseName)?spouseName:"")
				.element("cntryTaxRes1", StringUtils.isNotBlank(cntryTaxRes1)?cntryTaxRes1:"")
				.element("tinCntry1", StringUtils.isNotBlank(tinCntry1)?tinCntry1:"")
				.element("docColDt1", StringUtils.isNotBlank(docColDt1)?docColDt1:"")
				.element("cntryTaxRes2", StringUtils.isNotBlank(cntryTaxRes2)?cntryTaxRes2:"")
				.element("tin2", StringUtils.isNotBlank(tin2)?tin2:"")
				.element("tinCntry2", StringUtils.isNotBlank(tinCntry2)?tinCntry2:"")
				.element("docColDt2", StringUtils.isNotBlank(docColDt2)?docColDt2:"")
				.element("tin3", StringUtils.isNotBlank(tin3)?tin3:"")
				.element("tinCntry3", StringUtils.isNotBlank(tinCntry3)?ofac:"")
				.element("docColDt3", StringUtils.isNotBlank(docColDt3)?docColDt3:"")
				.element("cntryTaxRes3", StringUtils.isNotBlank(cntryTaxRes3)?cntryTaxRes3:"")
				.element("remarks", StringUtils.isNotBlank(remarks)?remarks:"")
				.element("deviationChargesFlag", StringUtils.isNotBlank(deviationChargesFlag)?deviationChargesFlag:"")
				.element("interestDefferedDate", StringUtils.isNotBlank(interestDefferedDate)?interestDefferedDate:"")
				.element("cibil", StringUtils.isNotBlank(cibil)?cibil:"")
				.element("processingFee", StringUtils.isNotBlank(processingFee)?processingFee:"")
				.element("expiryDate", StringUtils.isNotBlank(expiryDate)?expiryDate:"")
				.element("goldType", StringUtils.isNotBlank(goldType)?goldType:"")
				.element("goldpouch", StringUtils.isNotBlank(goldpouch)?goldpouch:"")
				.element("mutProp", StringUtils.isNotBlank(mutProp)?mutProp:"")
				.element("udinflg", StringUtils.isNotBlank(udinflg)?udinflg:"")
				.element("udinnum", StringUtils.isNotBlank(udinnum)?udinnum:"")
				.element("csaCode", StringUtils.isNotBlank(csaCode)?csaCode:"")
				.element("dealerName", StringUtils.isNotBlank(dealerName)?dealerName:"")
				.element("dealerNumber", StringUtils.isNotBlank(dealerNumber)?dealerNumber:"")
				.element("dealerIFSC", StringUtils.isNotBlank(dealerIFSC)?dealerIFSC:"")
				.element("marginAmt", StringUtils.isNotBlank(marginAmt)?marginAmt:"")
				.element("advPaid", StringUtils.isNotBlank(advPaid)?advPaid:"")
				.element("blanck", StringUtils.isNotBlank(blanck)?blanck:"")
				.element("msgid", StringUtils.isNotBlank(msgid)?msgid:"")
				.element("freeCode8", StringUtils.isNotBlank(freeCode8)?freeCode8:"")
				.element("cgtsmeCode", StringUtils.isNotBlank(cgtsmeCode)?cgtsmeCode:"")
				.element("intTblCodeApi", StringUtils.isNotBlank(intTblCodeApi)?intTblCodeApi:"")
				.element("acctPrefInt", StringUtils.isNotBlank(acctPrefInt)?acctPrefInt:"")
				.element("userId", StringUtils.isNotBlank(userId)?userId:"")
				.element("freeCode1", StringUtils.isNotBlank(freeCode1)?freeCode1:"")
				.element("freeCode2", StringUtils.isNotBlank(freeCode2)?freeCode2:"")
				.element("freeCode3", StringUtils.isNotBlank(freeCode3)?freeCode3:"")
				.element("freeCode4", StringUtils.isNotBlank(freeCode4)?freeCode4:"")
				.element("freeCode9", StringUtils.isNotBlank(freeCode9)?freeCode9:"")
				.element("freeCode10", StringUtils.isNotBlank(freeCode10)?freeCode10:"")
				.element("projectCost", StringUtils.isNotBlank(projectCost)?projectCost:"")
				.element("location", StringUtils.isNotBlank(location)?location:"")
				.element("clenderDetails", StringUtils.isNotBlank(colenderDetails)?colenderDetails:"")
				.element("invstmtInPlantMachine", StringUtils.isNotBlank(invstmtInPlantMachine)?invstmtInPlantMachine:"")
				.element("turnOver", StringUtils.isNotBlank(turnOver)?turnOver:"")
				
				.endelement().printXML();
		}


	

}
