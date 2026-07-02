package in.sp.dao;
import in.sp.config.*;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public class StudenDAO {
	private JdbcTemplate myjdbcTemplate;
public StudenDAO(JdbcTemplate myJdbcTemplate) {
 this.myjdbcTemplate=myjdbcTemplate;

}
String sql="INSERT INTO student VALLUES(?,?,?)";
String std_name="Riya kosta";
int std_rollno=2345;
int std_marks=234;
}
