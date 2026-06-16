
package in.sp.beans;

public class Address {
private int houseno;
private	String cityname;
private int pincode;

public Address(int houseno ,String cityname, int pincode) {
	this.houseno=houseno;
	this.cityname=cityname;
	this.pincode=pincode;
}
// to print object output into string form

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "houseNo." +houseno+
		", CityName " +cityname+
	 ", pincode " +pincode;
	}
}
