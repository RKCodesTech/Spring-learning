package in.sp.beans;

public class Address {
private String cityname;
private String houseno;
public void setCityname(String cityname) {
	this.cityname = cityname;
}
public void setHouseno(String houseno) {
	this.houseno = houseno;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub     
		return "cityName"+cityname +", houseNo" +houseno; // it will convert object type o/p like this Address: in.sp.beans.Address@78691363 into string form
	}

}
