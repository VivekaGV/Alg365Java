package OOPs;

public class BookManagement {

    public boolean checkout(Student student,Book book){
        System.out.println("Student Name is " + student.Name + " and  taken the book "+ book.gettitle());
       return true;
    }

        public boolean returnout(Student student,Book book){
        System.out.println("Student Name is " + student.Name + " and return the book "+ book.gettitle());
       return true;
    }
    
    
}
