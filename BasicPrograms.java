import java.util.Scanner;

public class BasicPrograms
 {
    //TWo nuumber Addtion
    public static int getsum(int number1,int number2){
          return number1+number2;
    }
    //without third variale usage
    public static void swap(int number1,int number2){
        System.out.println("Before Swap:->");
        System.out.println("Number1 is:" +number1);
        System.out.println("Number2 is:" +number2);
        number2=number1+number2;
        number1=number2-number1;
        number2=number2-number1;
        System.out.println("After Swap:->");
        System.out.println("Number1 is:" +number1);
        System.out.println("Number2 is:" +number2);
    }
    
    //Number is Odd or Even
    public static void Isevenorodd(int number){
        if(number % 2==0){
            System.out.println(number + " Number is Even" );
        }
        else{
            System.out.println(number + " Number is Odd");
        }
    }
    //ISnumber
    public static void ISnumber(String arr){
        boolean temp = true;
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)<'0'|| arr.charAt(i)>'9'){
                System.out.print(arr);
                System.out.println(" Not a Proper number");
                temp=false;
                break;
            }
        }
        if(temp){
            System.out.print(arr);
        System.out.println(" Given number is proper");
        }
    }
  

    public static void main(String[] args) {
        System.out.println("Sum of two numbers:" + getsum(2,3));
        System.out.println();
        swap(2, 9); 
        System.out.println(); 
        Isevenorodd(3);
        Isevenorodd(4);
          System.out.println(); 
        ISnumber("1a0");
         ISnumber("10");
     }
}
