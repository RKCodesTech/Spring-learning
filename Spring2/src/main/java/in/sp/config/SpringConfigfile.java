package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.com.Student;

@Configuration
public class SpringConfigfile {
@Bean("StdId1")
public Student obj1(){
	Student std=new Student();
	std.setName("priyaa");
	std.setEmail("priya123@gmail.com");
	std.setRollno(234);
	return std;

}
@Bean("StdId2")
public Student obj2() {
	Student std1= new Student();
	std1.setName("Riya ");
	std1.setEmail("riya@123");
	std1.setRollno(123456789);
	return std1;
}

}
