package AdvanceOOPS;

public class Ebook extends Book{

    String fileformat;

    public Ebook (String id, String title, String author,int pages, String fileformat){
        super(id,author,title,pages);
        this.fileformat = fileformat;
    }

    public void Search(String name){
        System.out.println("Search by name.... ");
    }

     public void Search(String name, String id){
        System.out.println("Search by name and author id ...");
    }

    public void printfileformat(){
        System.out.println("File format : " + this.fileformat);
    }


}