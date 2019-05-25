package com.pavana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pavana.model.Student;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
		Student st=factory.getBean("st", Student.class);
		Student st1=factory.getBean("st1", Student.class);

		System.out.println(st);
		System.out.println(st1);

	}

}
