package com.tandf.informa.ecommerce.gt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tandf.informa.ecommerce.gt.app.GtFeedProcessorApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { GtFeedProcessorApplication.class })
public class GtFeedProcessorApplicationTests {
	@Test
	public void contextLoads() {
		System.out.println("------------------------------ GtFeedProcessorApplicationTests.contextLoads() ------------------------------");
	}

}
