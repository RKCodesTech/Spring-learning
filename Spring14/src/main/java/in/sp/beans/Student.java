package in.sp.beans;

public class Student {
private String name;
private String email;
private int rollno;
private Address address;
public Student(String name, String email, int rollno, Address address) {
	this.name=name;
	this.email=email;
	this.rollno=rollno;
	this.address=address;
}
public void display() {
	System.out.print("Name: "+name);
	System.out.print("Email: "+email);
	System.out.print("Roll No : "+rollno);
	System.out.print("Address:  "+address);
}
}
