package AdvanceOOPS;
public class Application {

    public static void main(String[] args) {

    //LibraryItem item1 = new LibraryItem("12", "PC", "Ganesh Prasad");
    //item1.displayInfo();       
    System.out.println();
        
     Book book1 = new Book("223", "Rns","RAshmi" ,123);
     book1.displayInfo();
     System.out.println();

     Magazine magazine1 = new Magazine("222", "RER", "Mammtha", 03);
     magazine1.displayInfo();
     System.out.println();

     Ebook ebook1 = new Ebook("223", "EC","MAllikarjan" ,1235,"pdf");
     ebook1.displayInfo();
     ebook1.printfileformat();
     ebook1.Search("vivek");
     ebook1.checkout();
    
}
}