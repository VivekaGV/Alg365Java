public class Assignment1{

    // Function to prime the prime factors of given number 
    // 1 - To Write this Function Sequencially it takes O(n)
    // 2 - Another optimization is that we can divide the the number by 2 so that it can by optimized( E.g, 30 is maximum divisor is 15,so we check upto to 30/2 iterations)
    // 3 - Use optimized solution as run the itertions upto Sqrt(n) - only for the factors (E.g, 30 - factors are(2,15),(3,10) and(5,6) ,each factors with in 5 to 6 only so that sqrt of 30 is 5 to 6)
  public static void primefactors(int number){
    if(number==0||number==1){
        return;
    }
        while (number % 2 == 0) {
        System.out.println(2);
        number /= 2;
    }
  
    for(int index=3;index<=Math.sqrt(number);index+=2){
        while(number % index==0){
            System.out.println(index);
            number /= index;
        }
    }


 if(number > 2){
        System.out.println(number);
 }
}

    public static void main(String[] args) {
        primefactors(30);
        
    }
}
