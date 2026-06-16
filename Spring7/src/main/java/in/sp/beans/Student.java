package in.sp.beans;

public class Student {
private String name;
private int age;
private Address address;
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setAddress(Address address) {
	this.address = address;
}
public void display() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Address: "+address);
	
}
}
