package in.sp.dao;
import in.sp.config.*;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public class StudenDAO {
	private JdbcTemplate myjdbcTemplate;
public StudenDAO(JdbcTemplate myJdbcTemplate) {
 this.myjdbcTemplate=myjdbcTemplate;
}
}
