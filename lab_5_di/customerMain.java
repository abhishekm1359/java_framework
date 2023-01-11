package di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class customerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext contextClass = new ClassPathXmlApplicationContext("diCfg.xml");
		
		System.out.println(" ");
		Customer cus = (Customer) contextClass.getBean("customer");
		Customer cus1 = (Customer) contextClass.getBean("customer1");
		Customer cus11 = (Customer) contextClass.getBean("customer11");
		System.out.println("Printing with Dependency Injection Constructor with all parameters");
		cus.display();
		System.out.println(" ");
		System.out.println("Printing with Dependency Injection Constructor with id parameters");
		cus1.display();
		System.out.println(" ");
		System.out.println("Printing with Dependency Injection Constructor with name parameters");
		cus11.display();

	}

}
