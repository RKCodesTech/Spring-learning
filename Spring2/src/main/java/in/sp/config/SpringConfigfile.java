package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.com.Student;

@Configuration
public class SpringConfigfile {
@Bean("StdId1")
public Student StdI1(){
	Student std=new Student();
	std.setName("priyaa");
	std.setEmail("priya123@gmail.com");
	std.setRollno(234);
	return std;

}

}
