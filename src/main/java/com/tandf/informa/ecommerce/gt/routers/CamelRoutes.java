package com.tandf.informa.ecommerce.gt.routers;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoutes extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		from("activemq:start")
		.to("activemq:end");
	}
}