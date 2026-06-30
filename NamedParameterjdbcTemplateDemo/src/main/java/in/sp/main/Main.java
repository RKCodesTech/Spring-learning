package in.sp.main;

import in.sp.config.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigFile.class);

        NamedParameterJdbcTemplate npjtemplate =
                context.getBean(NamedParameterJdbcTemplate.class);

        String query = "INSERT INTO student (std_rollno, std_name, std_marks) VALUES (:rollno, :name, :marks)";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("rollno", "101");
        params.addValue("name", "Riya");
        params.addValue("marks", "95");

        int count = npjtemplate.update(query, params);

        if (count > 0) {
            System.out.println("Data Inserted Successfully");
        } else {
            System.out.println("Data Not Inserted");
        }
    }
}