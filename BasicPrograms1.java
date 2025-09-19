import java.util.Scanner;

public class BasicPrograms1 {
      public static void InputExample(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.nextLine();
        System.out.println("NAmaskara "+ name);
    }
    public static void AsciiValue(String word){
        for(int index=0;index<word.length();index++){
            System.out.println((int)word.charAt(index));
        }
    }
    //getlength of word
    public static int getlength(String word){
        int counter=0;
       for(char ch:word.toCharArray()){
            counter++;
        }
        return counter;
    }
    //Get number of vowels in word 
     public static int getlengthofvowels(String word){
        int counter=0;
        String vowels="AEIOUaeiou";
       for(char ch:word.toCharArray()){
       if (vowels.indexOf(ch) != -1) {
            counter++;
        }
    }
        return counter;
    }
    //Reverse a String -1
    public static String revereword(String word){
        StringBuilder newreverseword = new StringBuilder();
        int length=word.length()-1;
        while(length>=0){
            newreverseword.append(word.charAt(length));
            length--;
        }
        String resultword=newreverseword.toString();
        return resultword;

    }
    //Reverse a String -2
    public static String revereword2(String word){
        char[] chararray = word.toCharArray();
        int left=0;
        int right=word.length()-1;
       
    while (left < right) {
        char temp = chararray[left];
        chararray[left] = chararray[right];
        chararray[right] = temp;
        left++;
        right--;
    }
         return new String(chararray);
}


    public static void main(String[] args) {
       // InputExample();
       // AsciiValue("vivek");
        //System.out.println(getlengthofvowels("vivek"));
        System.out.println(revereword("vivek"));
        System.out.println(revereword2("vivek11"));
        
    }
    
}
