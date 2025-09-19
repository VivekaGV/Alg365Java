public class Namaste{
    public static void main(String[] args) {
        donothing();
        
    }
    public static void donothing(){
        String message= printmessage("Hello world");
        System.out.println(message);

    }
    public static String printmessage(String message){
        return message;
    }
}