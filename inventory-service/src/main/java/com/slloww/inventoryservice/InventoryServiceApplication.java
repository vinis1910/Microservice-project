package com.slloww.inventoryservice;

import com.slloww.inventoryservice.models.Inventory;
import com.slloww.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
//			Inventory inventory = new Inventory();
//			inventory.setSkuCode("iphone_15");
//			inventory.setQuantity(100);
//
//			Inventory inventory1 = new Inventory();
//			inventory.setSkuCode("iphone_11");
//			inventory.setQuantity(0);
//
//			inventoryRepository.save(inventory);
//			inventoryRepository.save(inventory1);
		};
	}

}
