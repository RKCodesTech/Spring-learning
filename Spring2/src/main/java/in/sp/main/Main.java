package in.sp.main;

import in.sp.com.Student;
import in.sp.config.SpringConfigfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigfile.class);

        Student std = (Student) context.getBean("StdId1");

        std.display();
    }
}