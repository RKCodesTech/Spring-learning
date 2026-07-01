package in.sp.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
@Bean
public DriverManagerDataSource Datasource() {
	DriverManagerDataSource drivermanager=new DriverManagerDataSource();
	drivermanager.setDriverClassName("com.mysql.cj.jdbc.Driver");
	drivermanager.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
	drivermanager.setUsername("root");
	drivermanager.setPassword("1234");
	return drivermanager;
}
@Bean
public JdbcTemplate myjdbctemplate() {
	JdbcTemplate jdbcTemplate=new JdbcTemplate();
	jdbcTemplate.setDataSource(DataSource());
}
}
