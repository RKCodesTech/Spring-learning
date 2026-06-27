import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
public DriverManagerDataSource myDataSource() {
	DriverManagerDataSource datasource=new DriverManagerDataSource();
	datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
	return datasource; 
}
}
