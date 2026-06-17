package in.sp.beans;

public class Student {


private String name;
private int age;
private Address address;
void Student(String name , int age , Address address) {
	this.name=name;
	this.age=age;
	this.address=address;
}
void display() {
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Address : "+address);
}
}


