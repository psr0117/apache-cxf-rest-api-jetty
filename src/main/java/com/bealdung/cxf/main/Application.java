package com.bealdung.cxf.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;


import com.bealdung.cxf.rest.service.PlayerService;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;


public class Application {

	public static void main(String[] args) throws Exception {
		JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJsonProvider());
		providers.add(new com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider());
		factoryBean.setProviders(providers);
		
		
		factoryBean.setResourceClasses(PlayerService.class);
		factoryBean.setResourceProvider(new SingletonResourceProvider(new PlayerService()));
		factoryBean.setAddress("http://localhost:8083/");
		Server server = factoryBean.create();
		//server.start();
		System.out.println("Server ready...");
        Thread.sleep(60 * 1000);
        System.out.println("Server exiting");
        server.destroy();
        System.exit(0);

	}

}
