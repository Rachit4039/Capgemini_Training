public class LibraryManagement {

    interface Reservable {
        void reserveItem();
        void checkAvailability();
    }

    abstract class LibraryItem {
        int itemId;
        String title;
        String author;

        private String borrowerName;

        public void setBorrowerName(String borrowerName) {
            this.borrowerName = borrowerName;
        }

        public String getBorrowerName() {
            return borrowerName;
        }

        public LibraryItem(int itemId, String title, String author) {
            this.itemId = itemId;
            this.title = title;
            this.author = author;
        }

        abstract int getLoanDuration();

        void getItemDetails() {
            System.out.println(itemId);
            System.out.println(title);
            System.out.println(author);
        }
    }

    class Book extends LibraryItem implements Reservable {

        Book(int itemId, String title, String author) {
            super(itemId, title, author);
        }

        int getLoanDuration() {
            return 5;
        }

        public void reserveItem() {
            System.out.println(title);
        }

        public void checkAvailability() {
            System.out.println(title);
        }
    }

    class Magazine extends LibraryItem implements Reservable {

        Magazine(int itemId, String title, String author) {
            super(itemId, title, author);
        }

        int getLoanDuration() {
            return 3;
        }

        public void reserveItem() {
            System.out.println(title);
        }

        public void checkAvailability() {
            System.out.println(title);
        }
    }

    class DVD extends LibraryItem implements Reservable {

        DVD(int itemId, String title, String author) {
            super(itemId, title, author);
        }

        int getLoanDuration() {
            return 2;
        }

        public void reserveItem() {
            System.out.println(title);
        }

        public void checkAvailability() {
            System.out.println(title);
        }
    }

    public static void main(String[] args) {
        LibraryManagement lm = new LibraryManagement();

        LibraryItem b = lm.new Book(1, "Java", "James");
        LibraryItem m = lm.new Magazine(2, "Tech", "Editor");
        LibraryItem d = lm.new DVD(3, "AI", "Director");

        b.getItemDetails();
        System.out.println(b.getLoanDuration());

        m.getItemDetails();
        System.out.println(m.getLoanDuration());

        d.getItemDetails();
        System.out.println(d.getLoanDuration());
    }
}
