package com.spring.project;

import static org.assertj.core.api.Assertions.assertThat;

//Con Junit 4.x era  import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMicroserviceEventApplicationTests_Verify {

	// Debería acertar aposta para verificar que van bien los test
	@Test
	void contextLoads() {

		assertThat(true).isTrue();
	}

}
