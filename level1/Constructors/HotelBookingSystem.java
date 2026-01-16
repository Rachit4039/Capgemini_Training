package level1.Constructors;

public class HotelBookingSystem {
    static class Hotel{
        private String guestName;
        private String roomType;
        private int night;

        Hotel(){
            System.out.print("Default");
        }

        Hotel(String guestName , String roomType , int night){
            this.guestName=guestName;
            this.roomType=roomType;
            this.night = night;
        }

        Hotel(Hotel h){
            this.guestName=h.guestName;
            this.night=h.night;
            this.roomType=h.roomType;
        }

        void display(){
            System.out.println(guestName);
            System.out.println(roomType);
            System.out.println(night);
        }

    }

    public static void main(String[] args) {
        Hotel h1 = new Hotel("Rachit","delux", 2);
        Hotel h2 = new Hotel(h1);
        h1.display();
        h2.display();
    }
}
