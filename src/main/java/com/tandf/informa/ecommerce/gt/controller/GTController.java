package com.tandf.informa.ecommerce.gt.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.camel.CamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tandf.informa.ecommerce.gt.models.Products;
import com.tandf.informa.ecommerce.gt.service.GTService;

@RestController
@RequestMapping("/api")
public class GTController {

	private static final Logger logger = LoggerFactory.getLogger(GTController.class);

	/* Provided by Spring @see http://camel.apache.org/spring-boot.html */
	@Autowired
	private CamelContext camelContext;

	@Autowired
	private GTService gtService;

	@GetMapping("/hello")
	public List<Products> hello() {
		logger.info("hello");
		List<Products> list = gtService.findAllProducts();
		return list;
	}

	@GetMapping("/stopall")
	public void stopAllCamelRoute() throws Exception {
		camelContext.stop();
	}

	@PostConstruct
	public void initAfterStartup() {
		System.out.println("GTController.afterPropertiesSet()... start");
	}

	@PreDestroy
	public void cleanupBeforeExit() {
		System.out.println("GTController.afterPropertiesSet()... end");
	}

}