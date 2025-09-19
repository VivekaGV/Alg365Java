package AdvanceOOPS;

// Base Class
abstract class LibraryItem {

    // BAse class attributes which can mainly used in Derived class
    public String id;
    private String title;
    protected String author;

    public LibraryItem(String id ,String title ,String author){
    this.id = id;
    this.title = title;
    this.author = author;
    }

    public void displayInfo(){
        System.out.println("Id : " + this.id);
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
    }

    private void searchItem(String name){
        System.out.println("Seraching..");
    }

    protected void searchAllitems(String name){
        System.out.println("Searching in protected function");
        this.searchItem(name);
    }

    abstract public void checkout();

    
}
