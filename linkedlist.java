import java.util.Scanner;
//Create Node
class Node{
    int val;
    Node next; // default value null 
    Node (int val){
        this.val =val;
    }
}
public class linkedlist{
    public static void main(String[] args){
       //Create linkedlist using user input 
        Scanner sc =new Scanner(System.in);
        Node a =new Node(sc.nextInt()); 
        Node b =new Node(sc.nextInt()); 
        Node c =new Node(sc.nextInt()); 
        Node d =new Node(sc.nextInt()); 
        Node e =new Node(sc.nextInt());
    
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // display(a);
        // displayrec(a);
        // displayrev(a);
        // count(a);
        // length(a);
        // linearsearch

    }
        //Display(traverse) Linkedlist 
        public static void display (Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }

            // for( temp = head; temp!=null;temp=temp.next){
             //     System.out.print(temp.val+" ");
            // }
            System.out.println();
        }
          //Display using recursion
          public static void displayrec(Node head){
            if(head==null) return;
          System.out.print(head.val+" ");
          displayrec(head.next);

          }

          //reverse in linkedlist
          public static void displayrev (Node head){
             if(head==null) return;
            displayrev(head.next);
          System.out.print(head.val+" ");
          
            }

            //count no.of nodes
        public static void  count(Node head){
            int count=0;
            Node temp=head;
           while(temp!=null){
               count++;
               temp=temp.next;
           }
           System.out.print(count);
        }        
    
        //length of linkedlist
        public static void  length(Node head){
            int length=0;
            Node temp=head;
           while(temp!=null){
               length++;
               temp=temp.next;
           }
           System.out.print(length);
        }        


        //linear search in linked list 


    }
