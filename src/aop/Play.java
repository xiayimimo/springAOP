package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {
	 public static void main(String[] args) {
	        ApplicationContext ac
	            = new ClassPathXmlApplicationContext("applicationContext.xml");
	        Performer p = (Performer) ac.getBean("performer");
	        p.perform();
//	        Volunteer m = (Volunteer) ac.getBean("volunteer");
//	        m.thinkOfSomething("ri");
//	        Contestant c = (Contestant) ac.getBean("contestant");
//	        c.receiveAward();
	        Audience a = new Audience();
//	        a.performance();
	    }
}
