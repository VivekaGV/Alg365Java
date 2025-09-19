package OOPs;

public class Student {
    public String Name;
    public int Age;
    private String Degree;
    private int ID;
    protected String Hometown;
    private int count;

    // Parametric constructor
    public Student(String name,int age,String degree,String hometown){
        this.Name = name;
        this.Age = age;
        this.Degree = degree;
        this.Hometown = hometown;
    }
    //Constructor without inputs
    public Student(){

    }
    //Constructor withonly one input
    public Student(String name){
        this.Name=name;
    }

    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.Age;
    }
    public String getDegree(){
        return this.Degree;
    }
    public String Gethometown(){
        return this.Hometown;
    }

    public int Register(){
        count++;
        this.ID=count;
        return ID;
    }

     private void updateName(String name){
        this.Name=name;
    }
     private void updateAge(int age){
       this.Age=age;
    }
    
}
