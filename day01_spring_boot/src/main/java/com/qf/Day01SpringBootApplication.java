package com.qf;

import configur.Skyconfigur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class Day01SpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Day01SpringBootApplication.class, args);
		Skyconfigur bean = context.getBean(Skyconfigur.class);
		System.out.println(bean.creatPerson().creatPerson());

//		Object bean = context.getBean("helloController");
//		String[] beanNamesForType = context.getBeanNamesForType(DataSource.class);
//		System.out.println(beanNamesForType[0]);
//		System.out.println(bean);
	}

}
