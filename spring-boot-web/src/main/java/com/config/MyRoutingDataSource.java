package com.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

@Component
public class MyRoutingDataSource extends AbstractRoutingDataSource{
	
	public MyRoutingDataSource() {
		this.setTargetDataSources(new HashMap<>());
	}

	@Override
	protected Object determineCurrentLookupKey() {
        System.out.println("MyRoutingDataSource");
		return "efw";
	}
  
}
