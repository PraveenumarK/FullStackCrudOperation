package com.fullstack.FullStackCrudOperation;

import org.springframework.boot.SpringApplication;

public class TestFullStackCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.from(FullStackCrudOperationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
