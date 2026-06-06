package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

public class Main {

    public static void main(String[] args) {

        String config_loc = "src/main/resources/ApplicationContext.xml";

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student s = (Student) context.getBean("StdId");

        s.display();
    }
}