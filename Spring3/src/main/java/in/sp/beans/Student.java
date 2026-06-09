package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
@Value("Riya")
    private String name;
@Value("riya@123")
    private String email;
@Value("1234")//automatically will convert in int
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void display() {
    	System.out.println(name);
    	System.out.println(email);
    	System.out.println(rollno);
    	
    }
}