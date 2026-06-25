package in.sp.config;
import in.sp.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configfile {
@Bean
public Student obj1() {
	Student std = new Student ();
	std .setName("Riya");
	std.setAge(19);
//	std.setAddress(obj2());  expect this injection see student.class
	return std;
}
@Bean
public Address obj2() {
	Address adr= new Address();
	adr.setCityname("Indore");
	adr.setPincode(123456789);
	return adr;
}@Bean
public Address obj3() {
Address adrr= new Address();
adrr.setCityname("Jhansi");
adrr.setPincode(986532);
return adrr;
}
}
