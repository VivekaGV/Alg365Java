package AdvanceOOPS;

public class Book extends LibraryItem{

    private int pages;

    public Book(String id , String title , String author,int pages){
        super(id,title,author);
        this.pages = pages;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Pages : " + this.pages);

    }

    public void checkout(){
        System.out.println("Check out using by Book");
    }
}