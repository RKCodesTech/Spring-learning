
package in.sp.beans;

public class Address {
private int houseno;
private	String cityname;
private int pincode;
public void setHouseno(int houseno) {
	this.houseno = houseno;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

// to convert object o/p into string
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "houseNo." +houseno+
		", CityName " +cityname+
	 ", pincode " +pincode;
	}
}
