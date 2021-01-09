package com.uwaai.datareststastemachine;

import com.uwaai.datareststastemachine.item.Item;
import com.uwaai.datareststastemachine.order.Order;
import com.uwaai.datareststastemachine.tag.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DataRestStastemachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataRestStastemachineApplication.class, args);
	}

}
