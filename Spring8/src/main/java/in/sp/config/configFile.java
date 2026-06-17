package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.*;

@Configuration
public class configFile {
	@Bean("StdId1")
	public Student obj1() {
	    Student std = new Student("Riya", 19, obj2());
	    return std;
	}

	@Bean("StdId2")
	public Address obj2() {
	    Address adr = new Address(12345, "Indore");
	    return adr;
	}
}
