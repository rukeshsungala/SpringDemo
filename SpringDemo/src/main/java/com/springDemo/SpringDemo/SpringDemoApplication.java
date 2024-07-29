package com.springDemo.SpringDemo;

import com.springDemo.SpringDemo.model.Laptop;
import com.springDemo.SpringDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);


		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

		/*Normal Object
		Alien obj = new Alien();
		obj.code();
		 */

//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();
		/*Alien obj1;
		obj1 = context.getBean(Alien.class);
		obj1.code();
		 */



	}

}
