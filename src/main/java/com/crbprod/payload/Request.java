package com.crbprod.payload;

import javax.validation.constraints.Null;

public class Request {
	private Long tenantId;
	private String nationalID;
	private String companyRegNo;
	public Long getTenantId() {
		return tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public String getCompanyRegNo() {
		return companyRegNo;
	}
	public void setCompanyRegNo(String companyRegNo) {
		this.companyRegNo = companyRegNo;
	}
	
	
	
	
	}
