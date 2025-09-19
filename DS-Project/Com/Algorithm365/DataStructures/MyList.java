package Com.Algorithm365.DataStructures;
// Array built in package
import java.util.ArrayList;

public class MyList {
    
    private ArrayList<Integer> List = new ArrayList<>();
    public static void main(String[] args) {

    }
  // Append Function to List
    public void addElement(int element){
        List.add(element);
    }
// Function is Used to print the elements of List
    public void PrintElments(){
        System.out.println("List : " + List);

    }
    
}
