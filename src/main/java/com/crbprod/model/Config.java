package com.crbprod.model;

import javax.persistence.*;

@Entity
@Table(name = "crb_configuration_creditinfo")
public class Config {

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "strategy_id")
	private String strategyId;

	@Column(name = "tenant_id")
	private Long tenantId;
	
	@Column(name = "connector_id")
	private String connectorId;

	public String getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}
	

	public Config(String username, String password, String url, String strategyId, Long tenantId, String connectorId,
			Long id) {
		super();
		this.username = username;
		this.password = password;
		this.url = url;
		this.strategyId = strategyId;
		this.tenantId = tenantId;
		this.connectorId = connectorId;
		this.id = id;
	}


	@Id
	private Long id;

	public Config() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStrategyId() {
		return strategyId;
	}

	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}



}
