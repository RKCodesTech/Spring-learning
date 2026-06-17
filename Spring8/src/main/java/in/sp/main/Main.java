package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.beans.Student;

public class Main {
ApplicationContext context =new AnnotationConfigApplicationContext("configFile.java");
Student std =(Student) context.getBean("stdId");
std.display();
}
