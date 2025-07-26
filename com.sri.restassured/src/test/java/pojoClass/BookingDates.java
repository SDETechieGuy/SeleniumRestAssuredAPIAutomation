package pojoClass;

public class BookingDates {
	private String checkin;
	private String checkout;

	public BookingDates(String checkin, String checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public String getcheckin() {
		return checkin;
	}

	public String getcheckout() {
		return checkout;
	}

	public void setcheckin(String checkin) {
		this.checkin = checkin;
	}

	public void setcheckout(String checkout) {
		this.checkout = checkout;
	}

}
