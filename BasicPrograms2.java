public class BasicPrograms2 {
    // Sum of the elements in array
    public static int getsum(int[] numbers){
     int sum=0;
     for(int index=0;index<numbers.length;index++){
        sum+=numbers[index];
     }
     return sum;
    }

    // Palindrome
    public static void ispalindrome(String word){
        int left=0;
        int right=word.length()-1;
        boolean result = true;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                result=false;
                break;
            }
            left++;
            right--;
        }
        if(result){
            System.out.println(word+" is Palindrome");
        }
        else{
             System.out.println(word+" is Not a Palindrome");
        }

    }

    // Maximum and minimum elemnt in array

    public static void Maximunandminimum(int[] array){
        if(array.length==0){
            System.out.println("Empty Array");
            return;
        }
        int min=array[0];
        int max=array[0];
        for(int index=0;index<array.length;index++){
            if(min>array[index]){
                min=array[index];
            }
             if(max<array[index]){
                max=array[index];
            }
            

        }
        System.out.println("Minimum Value is:"+min);
        System.out.println("Maximum Value is:"+max);
    }

    // Element search in an array - 1
    public static void searchelemnt(int[] array,int element){
        if(array.length==0){
            System.out.println("Empty Array");
            return;
        }
        boolean result=false;
        for(int index=0;index<array.length;index++){
            if(array[index]==element){
              result=true;
            }
        }
        if(result){
              System.out.println(element+" is Found");
        }
        else{
              System.out.println(element+" is Not Found");
        }

    }
 // Element search in an array - 2 (only for sorted array)
public static void searchelemnt2(int[] array, int element) {
    boolean result = false;
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;

        if (array[mid] == element) {
            result = true;
            break;
        } else if (array[mid] < element) {
            left = mid + 1; 
        } else {
            right = mid - 1;
        }
    }

    if (result) {
        System.out.println("Element Found");
    } else {
        System.out.println("Element is not found");
    }
}
//Merge two arrays
public static void mergeArray(int[] array1,int[] array2){
    int[] merged = new int[array1.length + array2.length];

    for (int i = 0; i < array1.length; i++) {
        merged[i] = array1[i];
    }

    for (int i = 0; i < array2.length; i++) {
        merged[array1.length + i] = array2[i];
    }

  
    System.out.print("Merged array: ");
    for (int num : merged) {
        System.out.print(num + " ");
    }
    
}


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array1 = {8,5,43,9};
      System.out.println(getsum(array));
        ispalindrome("vivek");
        ispalindrome("abccba");
        Maximunandminimum(array1);
      searchelemnt(array, 4);
       searchelemnt(array1, 7);
      searchelemnt2(array,9);
      mergeArray(array1, array1);
    }
}
