package Interfaceoops;

public class Applicatiuon {

    public static void main(String[] args) {


       // LibManagement app = new LibManagement();

        SIETLibManagement app1 = new SIETLibManagement();
        //app1.checkout();
        LibManagement app2 = new SIETLibManagement(); 
        //app2.checkout();

        LibManagement app3 = new AITlibmanagement();

        app2 = app3;
        app2.checkout();
        
        


        
    }
    
}
