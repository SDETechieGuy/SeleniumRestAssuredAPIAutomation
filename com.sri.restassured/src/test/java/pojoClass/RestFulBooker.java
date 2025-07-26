package pojoClass;

public class RestFulBooker 
{
	
	private String firstname;
	private String lastname;
	private int totalprice;
	private boolean depositpaid;
	private String additionalneeds;
	private BookingDates bookingdates;
	
	public RestFulBooker(String firstname,String lastname,int totalprice,boolean depositpaid,String additionalneeds,BookingDates bookingdates)
	{
	  this.firstname=firstname;
	  this.lastname=lastname;
	  this.totalprice=totalprice;
	  this.depositpaid=depositpaid;
	  this.bookingdates=bookingdates;
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
	public int gettotalprice() {
		return totalprice;
	}
	public void settotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public BookingDates getbookingdates() {
		return bookingdates;
	}
	public void setbookingdates(BookingDates bookingdates) {
		this.bookingdates=bookingdates;
	}
	
	public String getadditionalneeds() {
		return additionalneeds;
	}
	public void setadditionalaeeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}
	
	public boolean isdepositpaid() {
		return depositpaid;
	}
	public void setdepositpaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}

	@Override
	public String toString() {
		return "RestFulBooker [firstname=" + firstname + ", lastname=" + lastname + ", totalprice=" + totalprice
				+ ", depositpaid=" + depositpaid + ", additionalneeds=" + additionalneeds + ", bookingdates="
				+ bookingdates + "]";
	}

	
	

}
