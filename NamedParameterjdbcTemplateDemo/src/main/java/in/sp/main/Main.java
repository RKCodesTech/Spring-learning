package in.sp.main;

import in.sp.config.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigFile.class);

        // Get Bean
        NamedParameterJdbcTemplate npjtemplate =
                context.getBean("namedParameterJdbcTemplate", NamedParameterJdbcTemplate.class);

        // Parameters
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("rollno", "101");
        params.addValue("name", "Riya");
        params.addValue("marks", "95");

        String query = "INSERT INTO student VALUES(:rollno, :name, :marks)";

        int count = npjtemplate.update(query, params);

        if (count > 0) {
            System.out.println("Data Inserted Successfully");
        } else {
            System.out.println("Data Not Inserted");
        }
    }
}