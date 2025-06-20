package com.punit.merchant_management;

import org.springframework.boot.SpringApplication;

public class TestMerchantManagementApplication {

	public static void main(String[] args) {
		SpringApplication.from(MerchantManagementApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
