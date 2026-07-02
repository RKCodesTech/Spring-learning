	package in.sp.dao;
	import in.sp.config.*;
	import javax.sql.DataSource;
	import in.sp.beans.*;
	import org.springframework.jdbc.core.JdbcTemplate;
	
	
	public class StudenDAO {
		private JdbcTemplate myjdbcTemplate;
	public StudenDAO(JdbcTemplate myJdbcTemplate) {
	 this.myjdbcTemplate=myjdbcTemplate;

	
	}
	public int insertStudent(Student student) {
	
	
	String sql="INSERT INTO student VALUES(?,?,?)";
	
	return myjdbcTemplate.update(sql,student.getStd_rollno(),student.getStd_name(),student.getStd_marks());
	}
	}