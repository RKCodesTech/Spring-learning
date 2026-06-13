package in.sp.beans;

public class Student {

    private int rollno;
    private String name;
    private Address address;





	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(address);
		
	}
}