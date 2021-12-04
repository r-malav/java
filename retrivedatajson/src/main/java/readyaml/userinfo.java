package readyaml;

public class userinfo {
	private String fname;
	private String lname;
	private String city;
	private int code;
	private String area;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "\nfname: " + fname + "\nlname: " 
		        + lname + "\ncity: " + city 
		        + "\ncode: " +code
				+ "\narea: " + area + "\n";
	}
	

}

