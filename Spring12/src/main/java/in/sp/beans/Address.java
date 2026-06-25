package in.sp.beans;

public class Address {
private String cityname;
private int pincode;
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
	public String toString() {
	
		return "City Name: "+cityname +" Pincode : " +pincode;
	}
}
