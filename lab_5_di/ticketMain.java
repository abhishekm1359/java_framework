package di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class ticketMain {

	public static void main(String[] args) {
		
		ApplicationContext contextClass = new ClassPathXmlApplicationContext("diCfg.xml");
//		
//		Ticket ticc1 = (Ticket) contextClass.getBean("ticket");
//		System.out.println("Printing with 2 parameters");
//		ticc1.display();
//		
//		System.out.println(" ");
//		Ticket ticc2 = (Ticket) contextClass.getBean("ticket1");
//		System.out.println("Printing with 3 parameters");
//		ticc2.display();
		
		System.out.println(" ");
		Ticket tic2 = (Ticket) contextClass.getBean("ticket2");
		System.out.println("Printing with Dependency Injection");
		tic2.display();
		
		System.out.println(" ");
		tic2.setTicket_no(999);
		tic2.setCity("Chennai");
		tic2.setPrice(2000);
		System.out.println("Using user values");
		tic2.display();
		
		
		System.out.println(" ");
		Resource r = new ClassPathResource("diCfg.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Ticket tic = (Ticket)factory.getBean("ticket2");
		System.out.println("Printing with Bean Factory");
		tic.display();
		
		
	}

}
