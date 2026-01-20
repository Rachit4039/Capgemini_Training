

public class LibraryManagementSystem {
    static class Book{
         String title;
         int publicationYear;

        Book(String title , int publicationYear){
            this.title=title;
            this.publicationYear= publicationYear;
        }
    }

    static class Author extends Book{
        private String name;
        private String bio;

        Author(String title , int publicationYear,String name , String bio){
            super(title,publicationYear);
            this.name=name;
            this.bio= bio;
        }

        void displayInfo(){
            System.out.println(title);
            System.out.println(publicationYear);
            System.out.println(name);
            System.out.println(bio);
        }
    }
    public static void main(String[] args) {
        Author a = new Author("capgemini", 2025,"rachit","training");
        a.displayInfo();   
    }
}
