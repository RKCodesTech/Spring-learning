package in.sp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.*;
@Configuration
public class SpirngConfilgfile {
	@Bean
	public Address Adrobj() {
		Address adr=new Address();
		adr.setCityname("Jhansi");
		adr.setHouseno("345");
		return adr;
	}
	@Bean
	public Student Stdobj() {
		Student std= new Student();
		std.setName("Riya Kosta");
		std.setAge(19);
		std.setAddress(Adrobj());  //injected object of address class here
		return std;
	}

}
