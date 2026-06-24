package in.sp.beans;

public class Student {
private String name;
private String email;
private int rollno;
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
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
	System.out.print("Name: "+name);
	System.out.print("Email: "+email);
	System.out.print("Roll No : "+rollno);
	System.out.print("Address:  "+address);
}
}
