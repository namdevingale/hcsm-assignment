package com.crnr.hcms.assignment;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Namadev
 * 
 * @version 1.0
 */
@SpringBootApplication
public class HcsmAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcsmAssignmentApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
