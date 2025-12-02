package com.hmis.hmis_backend;

import org.springframework.boot.SpringApplication;

public class TestHmisBackendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(HmisBackendServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
