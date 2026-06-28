package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import in.sp.resources.SpringConfigFile;
public class App {
	int std_rollno=2345;
	String std_name="Riya";
	int std_marks=34547;
public static void main (String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
	JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
	String insert_sqlQuery="INSERT INTO student VALUES(?,?,?)";
	int count =jdbcTemplate.update(insert_sqlQuery, std_rollno,std_name,std_marks);
	if(count>0) {
		System.out.println("insertion success");
	}else {
		System.out.println("insertion failed");
	}
}
}

















