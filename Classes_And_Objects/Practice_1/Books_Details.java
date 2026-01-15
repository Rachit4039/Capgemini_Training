public class Books_Details {
    static public class Book{
        private String Title;
        private String Author;
        private int Price;

        Book(String Title,String Author,int Price){
            this.Title=Title;
            this.Author=Author;
            this.Price=Price;
        }

        void display(){
            System.out.println("Title is "+ Title);
            System.out.println("Author is "+ Author);
            System.out.println("Price is "+ Price);
        }
    }

    public static void main(String args[]){
        Book b = new Book("rachit","Capgemini",100);
        b.display();
    }
}
