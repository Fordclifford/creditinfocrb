package com.crbprod.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crbprod.model.Config;

@Repository
	public interface ConfigRepo extends JpaRepository<Config,Long > {
		
		
	@Query(
			  value = "SELECT c.id, c.tenant_id,c.username,c.password,c.url,c.strategy_id,c.connector_id from crb_configuration_creditinfo c WHERE c.tenant_id = :id",
			  nativeQuery = true)
	Config findByTenantId(@Param("id") Long id);
	

}
