package in.sp.beans;

public class Address {
private int houseno;
private String cityname;
public Address(int houseno, String cityname) {
	this.houseno=houseno;
	this.cityname=cityname;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "houseNo. " +houseno +" ,cityname" +cityname;
	}
}
