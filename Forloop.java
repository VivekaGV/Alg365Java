public class Forloop {
    public static void main(String[] args){
        for(int index=0;index<10;index++){
            if( index == 5)
            continue;
            System.out.print(" " +index);
        }

    int count =10;
    while(count<20){
        System.out.print(" " + count);
        count++;
    }
    count=20;
    
    do{
        System.out.print(" "+ count);
        count++;
    }while(count<30);
}
}
    

