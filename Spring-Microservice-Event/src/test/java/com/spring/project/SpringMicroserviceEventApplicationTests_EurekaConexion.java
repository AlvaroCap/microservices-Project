package com.spring.project;

import java.io.IOException;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMicroserviceEventApplicationTests_EurekaConexion {
	private static final String GFG_URL = "http://localhost:1111/";
	private CloseableHttpClient httpClient;
	private CloseableHttpResponse httpResponse;

	// Comprobamos si la conexión a EurekaServer está levantada
	@Test
	void contextLoads() throws SQLException, IOException {

		httpClient = HttpClients.custom().build();
		final HttpGet request = new HttpGet(GFG_URL);
		httpResponse = httpClient.execute(request);
		assertThat(httpResponse.getCode()).isEqualTo(200);
	}

}
