package in.sp.main;
import in.sp.dao.*;
import in.sp.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.config.SpringConfigFile;

public class Main {
	public static void main(String[]args) {
ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
StudenDAO dao=context.getBean(StudenDAO.class);
Student std=new Student();
std.setStd_rollno(2345);
std.setStd_name("Ritesh Kosta");
std.setStd_marks(43543);


}
}
