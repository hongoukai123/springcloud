package com.kai.springcloudchapter1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)		//为随机端口的配置
public class SpringcloudChapter1ApplicationTests {

	@LocalServerPort
	private int port;
	private URL base;

	//TestRestTemplate类为RestTemplate测试类，用于远程调用httpAPI接口
	@Autowired
	private TestRestTemplate template;

	@Before
	public void setUp() throws Exception{
		this.base = new URL("http://localhost:" + port + "/hello");
	}

	@Test
	public void contextLoads() throws Exception {
		ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
		assertThat(response.getBody(), equalTo("Hello World!"));
	}

}
