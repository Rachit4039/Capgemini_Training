package level1.Constructors;

public class Books {
    static class BooksDetail{
        String title;
        String author;
        int price;

        BooksDetail(){
            System.out.println("default parameter called");
        }

        BooksDetail(String title,String author , int price){
           
            this.title=title;
            this.author = author;
            this.price = price;
            System.out.println("Parameter construtor called");
        }

    }

    public static void main(String args[]){
        BooksDetail b1 = new BooksDetail("rachit","rsgr",11);
        

    }
}
