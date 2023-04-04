package com.spring.project;

import java.sql.SQLException;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.sql.*;

@SpringBootTest
class SpringMicroserviceEventApplicationTests_DBConexion {

	// Comprobamos que la base de datos está funcionando
	@Test
	void contextLoads() throws SQLException {

		String url = "jdbc:mysql://10.80.150.107:3306/capgeticketdb";
		String username = "root";
		String password = "root";
		assertThat(DriverManager.getConnection(url, username, password)).isNotNull();
	}

}
