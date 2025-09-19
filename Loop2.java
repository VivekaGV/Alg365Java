public class Loop2{
    public static void main(String[] args) {
       printstarssequential(1000);
       printgrid1(10);  
       printgrid2(10);  
       int[] array = { 2,4,3,6,3,8,2};
       printstarsarray(array);    
    }

    // Function for Sequential print
    public static void printstarssequential(int number ){
        for(int count = 0 ; count < number ; count++){
            System.out.print("*");
        }
    }
        // Function for grid print-1
    public static void printgrid1(int number ){
        for(int row=0; row <= number ; row++){
            for(int column = 0 ; column<number;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     // Function for grid print
    public static void printgrid2(int number ){
        for(int row=1; row <=number ;row++){
            for(int column = 0 ; column < row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
// Function to print stars for value of array
    public static void printstarsarray(int[] numbers){
        for(int index=0 ; index < numbers.length ;index++){
            for(int count =0 ; count < numbers[index] ; count++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}