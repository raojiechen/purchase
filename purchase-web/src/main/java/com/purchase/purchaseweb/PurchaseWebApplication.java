package com.purchase.purchaseweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.cqnu.purchasedao.mapper")
@SpringBootApplication
public class PurchaseWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseWebApplication.class, args);
	}

}
