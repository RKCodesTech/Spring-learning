package in.sp.main;
import in.sp.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationConfig.xml");

        Student std = (Student) context.getBean("stdId");

        std.display();
    }
}