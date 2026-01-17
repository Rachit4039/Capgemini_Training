

public class BookLibrarySystem {

    static class Book{
        public int ISBN;
        protected String title;
        private String author;

        String getter(){
           return author;
        }

        void setter(String author){
            this.author=author;
        }
    }

    static class EBook extends Book{
        void display() {
            System.out.println(ISBN);   
            System.out.println(title); 
        }
    }
    public static void main(String args[]){
        Book b = new Book();
         b.ISBN = 101;
        b.title = "Java";
        b.setter("Rachit");

        EBook e = new EBook();
        e.ISBN = 202;
        e.title = "Advanced Java";
        e.display();
    }

}
