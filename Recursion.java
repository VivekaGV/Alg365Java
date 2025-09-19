public class Recursion {
      public static int increment(int counter){
        if (counter==11){
            return 0 ;
        }
        System.out.println(counter);
        increment(counter+1);
        return counter;
    }
    public static int decrement(int counter){
        if (counter==0){
            return 0 ;
        }
        System.out.println(counter);
        decrement(counter-1);
        return counter;
    }
    public static void main(String[] args) {
     decrement(10);
     increment(0);
    }
    
}
