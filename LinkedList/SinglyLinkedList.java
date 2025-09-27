package LinkedList;

public class SinglyLinkedList {

    Node head;
    
    public SinglyLinkedList(){
        this.head = null;
        System.out.println("Single Linked List Object is Created");
    }

    public void testAllOperations(){

        this.InseratBeginning(3);
        this.InseratBeginning(56);
        this.InseratBeginning(8);
        this.InserAtEnd(7);
        this.InserAtEnd(9);
        this.insertatposition(1, 3);
        this.insertatposition(1, 1);
        this.insertatposition(2, 8);
        this.insertatposition(2, 8);
        this.insertatposition(2, 8);
      /*  System.out.println("Number of Keys Found : " + this.Countkeys(8));
        this.PrintList();
        Deleteatbegiining();
        System.out.println();
        this.PrintList();
        deleteatend();
        System.out.println();
        this.PrintList();
        System.out.println();
        Searchbykey(100);
        Searchbykey(9);
        System.out.println();
        this.PrintList();
        System.out.println(Countkeys(9));
        */ 
        this.PrintList();
        deleteatposition(3);
        System.out.println();
        this.PrintList();
        deleteatposition(1);
        System.out.println();
        this.PrintList();
        deleteatposition(10);
        System.out.println();
        this.PrintList();
 
    }

// Function To Insert a New Mode At Beginning 
    public void InseratBeginning(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
             return ;
        }
        newNode.next = head ;
        this.head = newNode;
    }
    
    // Function To print All Elements of LIst
    public void PrintList(){
        if (this.head == null){
            System.out.println("Linked List Is Empty");
            return ;
        }
        Node temp = this.head ;
        while(temp != null){
            System.out.print(" "+ temp.data+" ->");
            temp = temp.next;
        }
    }

    //Fuction To Insert at End
    public void InserAtEnd(int data){

        Node newNode = new Node(data);
        
        if ( this.head == null){
            head = newNode ;
            System.out.println("List is Empty So, head is newNode");
            return;
        }
        Node temp = this.head;
        while( temp.next !=null){
            temp = temp.next;
        }
        temp.next = newNode ;
    }

    //Function to  insert at a Position
    public void insertatposition(int data, int position) {

    // check wheater a position is valid or not
    if(position<=0){
        System.out.println("Invalid positin to insert");
        return;
    }

    Node newNode = new Node(data);
    // Insert at beginning if position is at 1
    if(position==1){
       InseratBeginning(data);
        return;
    }

    int currentposition = 1;
    Node currentnode = this.head ;
    // Move to previous position where elememt need to insert
    while( currentposition < position-1 && currentnode != null){
        currentnode = currentnode.next ;
        currentposition += 1 ;
    }

    if (currentnode == null) {
        System.err.println("Invalid position:");
        return;
    }

    newNode.next = currentnode.next ;
    currentnode.next = newNode ;
}

    // Function to delete a element at Begin

    public void Deleteatbegiining(){

        if (this.head ==null){
            System.out.println("List is Empty");
            return;
        }
        if (this.head.next ==null){
            this.head = null;
            return;
        }
        this.head = this.head.next ;
    }

     // Function to delete a element at Begin
     public void deleteatend(){

         if (this.head ==null){
            System.out.println("List is Empty");
            return;
        }
        if (this.head.next ==null){
            this.head = null;
            return;
        }

        Node currentnode = this.head ;
        Node prevnode = this.head ;

        while( currentnode.next!=null){
              prevnode = currentnode;        
        currentnode = currentnode.next;
        }
         //    while( currentnode.next.next!=null){
           //     currentnode = currentnode.next;   
             //}
             // current.next = null
        prevnode.next = null ;

     }
        // Function To delete Element at specified locatiom in LIst
    public void Searchbykey(int key){
        if (this.head == null){
            System.out.println("Linked List Is Empty");
            return ;
        }
        Node temp = this.head ;
        while (temp!=null){
            if (temp.data == key){
             System.out.println("Key element found");
             return;
            }
            temp = temp.next;
        }
           System.out.println("Key element not found");

    }
    public int Countkeys(int key) {
        int count = 0;
        
        if (this.head == null) {
            return count;
        }
        
        Node temp = this.head;
        
        while (temp != null) {
            if (temp.data == key) {
                count++;
            }
            temp = temp.next;
        }
        
        return count;
    }

     // Function to delete a element at Specified position
     public void deleteatposition(int deleteposition){

        if(this.head == null){
            System.out.println("List is Empty");
            return;
        }

        if(deleteposition <= 0){
            System.out.println("Invalid Positiom to delete");
            return;
        }

         if (deleteposition == 1) {
        this.head = this.head.next;
        return;
    }

        int currentposition = 1;
        Node currNode = this.head;

        while( currentposition < deleteposition-1){

            currNode = currNode.next ;
            currentposition++;

            if(currNode == null){
                System.out.println("Invalid position to delete and insufficient List");
                return;
            }
        }
        currNode.next = currNode.next.next ;


     }
}