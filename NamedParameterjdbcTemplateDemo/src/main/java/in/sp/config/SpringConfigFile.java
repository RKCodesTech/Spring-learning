import in.sp.config.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
@Configuration
public class SpringConfigFile {
	
	
	@Bean
	// drivermanageer is that establish the connection between jdbc and application
public DriverManagerDataSource myDataSource() {
	DriverManagerDataSource datasource=new DriverManagerDataSource();
	datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
	datasource.setUsername("root");
	datasource.setPassword("1234");
	return datasource; 
}

//  
	@Bean
	public NamedParameterJdbcTemplate namedpara() {
	    return new NamedParameterJdbcTemplate(myDataSource());
	}
 }
