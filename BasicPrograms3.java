public class BasicPrograms3 {
// Function for getting second largest elemnt in array
    public static int Secondlargest(int[] array){
        int largest = array[0];
        int secondlarget = array[1];
         for(int index = 0 ; index<array.length;index++){
            if(array[index]>largest){
                secondlarget=largest;
                largest=array[index];
            }
            else if(array[index]>secondlarget){
                secondlarget=array[index];
            }
            }
            return secondlarget;
         }
  // Function for printing unique elements in array
      public static void Printuniquelemnets(int[] array) {
    for (int readindex = 0; readindex < array.length; readindex++) {
        boolean isduplicate = false;

        for (int compareindex = 0; compareindex < array.length; compareindex++) {
            if (readindex == compareindex) {
                continue;
            }
            if (array[readindex] == array[compareindex]) {
                isduplicate = true;
                break; 
            }
        }

        if (!isduplicate) {
            System.out.println(array[readindex]);
        }
    }
}
// Function to print common elements in two array (Intersection)
public static void printcommonelements(int[] array1,int[] array2){
    for(int arrayindex1=0;arrayindex1<array1.length;arrayindex1++){
        boolean result = false;
        for(int arrayindex2=0;arrayindex2<array2.length;arrayindex2++){
            if(array1[arrayindex1]==array2[arrayindex2]){
                result=true;
                break;
            }

        }
        if(result){
            System.out.print(array1[arrayindex1]+ " ");
        }
    }
}
// Main Function
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};

        int[] array2 = {1,6,4,6,4,2,9,0,6};
       // System.out.println(Secondlargest(array1));
       // Printuniquelemnets(array1);
        printcommonelements(array1, array2);
        
    }
}
