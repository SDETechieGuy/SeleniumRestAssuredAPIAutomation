package pojoClass;

public class Booking 
{
	private String firstname;
	private String lastname;
	private String totalprice;
	private boolean depositpaid;
	private String additionalneeds;
	
	public Booking(String firstname,String lastname,String totalprice,boolean depositpaid,String additionalneeds)
	{ 
		this.firstname=firstname;
		this.lastname=lastname;
		this.totalprice=totalprice;
		this.depositpaid=depositpaid;
		this.additionalneeds=additionalneeds;		
	}
	
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public String gettotalprice() {
		return totalprice;
	}
	public void settotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	public boolean isdepositpaid() {
		return depositpaid;
	}
	public void setdepositpaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}
	public String getadditionalneeds() {
		return additionalneeds;
	}
	public void setadditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}
	
	

}
