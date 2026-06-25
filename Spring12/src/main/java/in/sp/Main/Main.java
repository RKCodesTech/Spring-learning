package in.sp.Main;
import in.sp.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main (String []args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Student std=(Student) context.getBean("StdId");
	std.display();
}
}
