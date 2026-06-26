package in.sp.beans;

public class Address {
private String cityname;
private int pincode;
public Address(String cityname, int pincode) {
	this.cityname=cityname;
	this.pincode=pincode;
}
@Override
	public String toString() {
	
		return "City Name: "+cityname +" Pincode : " +pincode;
	}
}
