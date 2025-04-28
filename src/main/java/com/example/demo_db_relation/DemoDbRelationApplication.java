package com.example.demo_db_relation;

import com.example.demo_db_relation.services.TestProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDbRelationApplication implements CommandLineRunner {

	@Autowired
	private TestProcess testProcess;

	public static void main(String[] args) {
		SpringApplication.run(DemoDbRelationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testProcess.createData();
	}
}
