package in.sp.main;

import in.sp.config.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigFile.class);

   
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        String insert_Query="INSERT INTO student VALUES(?,?)";
    	int std_rollno=12345678;
    	String std_name="RiyaKosta";
    	  jdbcTemplate.update(insert_Query,std_rollno,std_name);
    	  
      	std_rollno=1238;
      	std_name="Krishna";
      	jdbcTemplate.update(insert_Query,std_rollno,std_name);
      	System.out.println("Both student's data inserted");

    
    
  
      
        
    }
}