package com.zenika.labs.sgtryout;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SgTryoutApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void should_say_hello() {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hello",
				String.class)).isEqualTo("World");
	}

//	@Test
//	public void should_say_bonjour() {
//		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/bonjour",
//				String.class)).isEqualTo("Monde");
//	}
//
//	@Test
//	public void should_say_hallo() {
//		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hallo",
//				String.class)).isEqualTo("die Welt");
//	}
//
//	@Test
//	public void should_say_selamat() {
//		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/selamat",
//				String.class)).isEqualTo("Selamat");
//	}

}
