package com.sogeti.dockerjenkinsintegration;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

@SpringBootTest
public class HelloControllerTest {
	
	/*
	 * @InjectMocks MockMvc mockMvc ;
	 */
	
	@Test
	void helloShouldReturnHello() {
		
		/*
		 * String endpoint = "/api/hello"; this.mockMvc .perform(get("/api/hello"))
		 * .andExpect(status().isOk());
		 * .andExpect(content().string(containsString("hello")));
		 */
	}
}
