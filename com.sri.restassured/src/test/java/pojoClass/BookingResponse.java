package pojoClass;

public class BookingResponse {
    private int bookingid;
    private Booking booking;

    // Getters and Setters
    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    // Inner class for Booking
    public static class Booking {
        private String firstname;
        private String lastname;
        private int totalprice;
        private boolean depositpaid;
        private BookingDates bookingdates;
        private String additionalneeds;

        // Getters and Setters
        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(int totalprice) {
            this.totalprice = totalprice;
        }

        public boolean isDepositpaid() {
            return depositpaid;
        }

        public void setDepositpaid(boolean depositpaid) {
            this.depositpaid = depositpaid;
        }

        public BookingDates getBookingdates() {
            return bookingdates;
        }

        public void setBookingdates(BookingDates bookingdates) {
            this.bookingdates = bookingdates;
        }

        public String getAdditionalneeds() {
            return additionalneeds;
        }

        public void setAdditionalneeds(String additionalneeds) {
            this.additionalneeds = additionalneeds;
        }
    }

    // Inner class for BookingDates
    public static class BookingDates {
        private String checkin;
        private String checkout;

        // Getters and Setters
        public String getCheckin() {
            return checkin;
        }

        public void setCheckin(String checkin) {
            this.checkin = checkin;
        }

        public String getCheckout() {
            return checkout;
        }

        public void setCheckout(String checkout) {
            this.checkout = checkout;
        }
    }
}
