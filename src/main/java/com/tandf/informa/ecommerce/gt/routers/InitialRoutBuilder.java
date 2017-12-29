package com.tandf.informa.ecommerce.gt.routers;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
	<b>This router is the entry point for GT feed processing</b><br>
	Depending on message header procudeure(<i>/message/header/procedure</i>) message is forwarded.
	<ol>
	<li>If the procedure is “O_PRDSETUP” then forward to ‘com.tandf.crcpress.ecommerce.products’</li>
	<li>If the procedure is “O_PRDSERI” then forward to ‘com.tandf.crcpress.ecommerce.series’</li>
	<li>If the procedure is “O_PRDCLASS” then forward to ‘com.tandf.crcpress.ecommerce.categories’</li>
	<li>If the procedure is “O_APBP” then forward to ‘com.tandf.crcpress.ecommerce.business-partner’</li>
	<li>Otherwise forward to ‘com.tandf.crcpress.ecommerce.invalid’
	</ol>
*/
@Component
public class InitialRoutBuilder extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		
		from("activemq:{{gt.init.queue}}")
		.filter(body().isNotNull())
		.choice()
        .when(xpath("/message/header/procedure = 'O_PRDSETUP'"))
            .to("activemq:{{gt.product.queue}}")
        .when(xpath("/message/header/procedure = 'O_PRDSERI'"))
            .to("activemq:{{gt.series.queue}}")
        .when(xpath("/message/header/procedure = 'O_PRDCLASS'"))
            .to("activemq:{{gt.classification.queue}}")
        .when(xpath("/message/header/procedure = 'O_APBP'"))
            .to("activemq:{{gt.business.partner.queue}}")
        .otherwise()
            .to("activemq:{{gt.error.queue}}");
	}
}