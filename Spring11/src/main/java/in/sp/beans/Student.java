package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
private String name;
private int age;
@Autowired           //do this for autowiring
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
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
