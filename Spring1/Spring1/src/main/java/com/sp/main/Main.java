package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

public class Main {

    public static void main(String[] args) {

       

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");//direct file name in bracket instead of writing address here

        Student s = (Student) context.getBean("StdId");

        s.display();
    }
}