package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Student;


@Configuration
public class BeanConfiguration {

	@Bean Student student() {
		Student bean = new Student("Tyler Johnson", 19, "2018");
		return bean;
	}
}
