import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	
	
	@Bean
	// drivermanageer is that establish the connection between jdbc and application
public DriverManagerDataSource myDataSource() {
	DriverManagerDataSource datasource=new DriverManagerDataSource();
	datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
	datasource.getUsername("root");
	datasource.getPassword("1234");
	return datasource; 
}

//  
	@Bean
public JdbcTemplate myjdbcTemplate() {
	JdbcTemplate jdbcTemplate=new JdbcTemplate();
	jdbcTemplate.setDataSource(myDataSource()); //myDataSource() this will return driverMangerDataSource
	return jdbcTemplate;
}
 }
