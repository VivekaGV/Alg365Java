public class Loops2 {
    // Function to print sequential 100 stars
    public static void sequentialprint(int number){
        for(int index = 0 ; index < number ;index++){
            System.out.print("*");
        }
    }
    // Function to print matrix pattern
    public static void printmatrix(int number){
        for(int row =0 ;row<number;row++){
            for(int column =0 ;column<number;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     // Function to print right angle triangle
     public static void printrightangletriange(int number){
           for(int row =0;row<number;row++){
            for(int column =0 ;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
      // Function to print array element's size - grid pattern
      public static void gridprint(int[] array){
        for(int index=0;index<array.length;index++){
            for(int element=0;element<array[index];element++){
                System.out.print("*");
            }
            System.out.println();
        }
      }
    // Main function
    public static void main(String[] args) {
        //sequentialprint(100);
        //printmatrix(10);
        //printrightangletriange(5);
        int[] array = {2,7,4,6,2,6,7};
        gridprint(array);
        
    }
}
