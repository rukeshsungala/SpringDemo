package com.springDemo.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

		/*Normal Object
		Alien obj = new Alien();
		obj.code();
		 */

		Alien obj = context.getBean(Alien.class);
		Alien obj1;
		obj1 = context.getBean(Alien.class);
		obj.code();
		obj1.code();

	}

}
