package OOPs;

public class Application{
    public static void main(String[] args) {

        Student new_student = new Student();// Heap memory Allocation

        new_student.Name="vivek";
        new_student.Age=21;
        //new_student.updateName("Ajay");

        
        System.out.println("Student Name : "+ new_student.Name);
        System.out.println("Student Age : " + new_student.getAge());

        Student new_student2 = new Student("sita",20, "BE", "tumkur");
        Student new_Student3 = new Student("Ram");
       
        System.out.println("Student Name : "+ new_student2.Name);
        System.out.println("Student Age : " +new_student2.getAge());

        System.out.println("Student Name : "+ new_Student3.Name);
        
        Book newbook = new Book("JavaProgrammig", "ABCD", "Coding", "1");
        BookManagement opeartions = new BookManagement();

        opeartions.checkout(new_Student3, newbook);
        opeartions.returnout(new_student2, newbook);
    }
    
}

