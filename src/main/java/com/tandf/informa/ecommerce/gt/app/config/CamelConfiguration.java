package com.tandf.informa.ecommerce.gt.app.config;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CamelConfiguration {

	@Bean
	CamelContextConfiguration contextConfiguration() {
		return new CamelContextConfiguration() {
			@Override
			public void beforeApplicationStart(CamelContext context) {
				context.addComponent("activemq", activeMqComponent());
			}

			@Override
			public void afterApplicationStart(CamelContext camelContext) {
				
				
			}
		};
	}
	
	private ActiveMQComponent activeMqComponent() {
		return ActiveMQComponent.activeMQComponent("tcp://localhost:61616");
	}
	
	
}
