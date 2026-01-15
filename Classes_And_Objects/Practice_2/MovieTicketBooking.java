class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Movie Name " + movieName);
        System.out.println("Seat No " + seatNumber);
        System.out.println("Price " + price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket("Inception", 25, 250.0);

        ticket.displayTicket();
    }
}
