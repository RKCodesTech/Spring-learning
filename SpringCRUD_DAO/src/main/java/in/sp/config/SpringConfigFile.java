package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
@Bean
public DriverManagerDataSource Datasource() {
	DriverManagerDataSource drivermanager=new DriverManagerDataSource();
	drivermanager.setDriverClassName("com.mysql.cj.jdbc.Driver");
	return drivermanager;
}
}
