package OOPs;

public class Book {

    private String title;
    private String author;
    private String category;
    private String id;

    public Book(String booktitle,String bookauthor,String bookcategory,String id){
        this.title = booktitle;
        this.author = bookauthor;
        this.category = bookcategory;
        this.id = id;
    }
    public void printBookdetails(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.category);
        System.out.println(this.id);

    }

    public String gettitle(){
        return this.title;
    }
    
}
