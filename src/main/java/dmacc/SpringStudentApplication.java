package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Student;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.StudentRepository;

@SpringBootApplication
public class SpringStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentApplication.class, args);
	}

}
	