package in.sp.main;

import in.sp.config.*;
import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(configFile.class);

        Student std = context.getBean(Student.class);
        std.display();
    }
}