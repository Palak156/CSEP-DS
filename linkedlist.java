import java.util.Scanner;
//Create Node
// class Node{
//     int val;
//     Node next; // default value null 
//     Node (int val){
//         this.val =val;
//     }
// }
// public class linkedlist{
    // public static void main(String[] args){
       //Create linkedlist using user input 
        // Scanner sc =new Scanner(System.in);
//         Node a =new Node(sc.nextInt()); 
//         Node b =new Node(sc.nextInt()); 
//         Node c =new Node(sc.nextInt()); 
//         Node d =new Node(sc.nextInt()); 
//         Node e =new Node(sc.nextInt());
    
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
        // display(a);
        // displayrec(a);
        // displayrev(a);
        // count(a);
        // length(a);
        // reverse(a);
        // System.out.println(get(a,2));

    // }
//         //Display(traverse) Linkedlist 
//         public static void display (Node head){
//             Node temp = head;
//             while(temp!=null){
//                 System.out.print(temp.val+" ");
//                 temp=temp.next;
//             }

//             // for( temp = head; temp!=null;temp=temp.next){
//              //     System.out.print(temp.val+" ");
//             // }
//             System.out.println();
//         }
//           //Display using recursion
//           public static void displayrec(Node head){
//             if(head==null) return;
//           System.out.print(head.val+" ");
//           displayrec(head.next);

//           }

//           //reverse in linkedlist
//           public static void displayrev (Node head){
//              if(head==null) return;
//             displayrev(head.next);
//           System.out.print(head.val+" ");
          
//             }

//             //count no.of nodes
//         public static void  count(Node head){
//             int count=0;
//             Node temp=head;
//            while(temp!=null){
//                count++;
//                temp=temp.next;
//            }
//            System.out.print(count);
//         }        
    
//         //length of linkedlist
//         public static void  length(Node head){
//             int length=0;
//             Node temp=head;
//            while(temp!=null){
//                length++;
//                temp=temp.next;
//            }
//            System.out.print(length);
//         }        

//linear search in linked list

// public static int get(Node head,int idx){
//     Node temp=head;
//     for (int i=1;i<=idx;i++){
//         temp=temp.next;
//     }
//     return temp.val;
// }

  
// //reverse a linked list
// class Main {

//     // Node structure
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static void main(String[] args) {

//         // Creating linked list
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);
//         head.next.next.next.next = new Node(50);

//         // Print original list
//         System.out.println("Original Linked List:");
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }

//         // Reverse linked list
//         Node prev = null;
//         Node curr = head;
//         Node next = null;

//         while (curr != null) {

//             // 1. Store next node
//             next = curr.next;

//             // 2. Reverse the link
//             curr.next = prev;

//             // 3. Move prev forward
//             prev = curr;

//             // 4. Move curr forward
//             curr = next;
//         }

//         // prev becomes the new head
//         head = prev;

//         // Print reversed list
//         System.out.println("\n\nReversed Linked List:");
//         temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
// }

// //find middle
// class Main {

//     // Node structure
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static void main(String[] args) {

//         // Creating Linked List
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);
//         head.next.next.next.next = new Node(50);

//         // Slow and Fast pointers
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;          // Move 1 step
//             fast = fast.next.next;     // Move 2 steps
//         }

//         // slow will be at middle
//         System.out.println("Middle element is: " + slow.data);
//     }
// }


                    //detect  cycle 
class Main {

    // Node 
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void  main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        // Connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create cycle 
        fifth.next = null;

        Node slow = head;
        Node fast = head;

        while (fast != null ) {

            slow = slow.next;          
            fast = fast.next.next;    

            if (slow == fast) {
                System.out.println("Present");
                return;
            }
        }

        System.out.println("Not present");
    }



//     class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class Main {

//     // Find starting point of cycle
//     static Node findCycleStart(Node head) {

//         Node slow = head;
//         Node fast = head;

//         // Detect cycle
//         while (fast != null && fast.next != null) {

//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 break;
//             }
//         }

//         // No cycle
//         if (fast == null || fast.next == null) {
//             return null;
//         }

//         //Find starting point
//         slow = head;

//         while (slow != fast) {
//             slow = slow.next;
//             fast = fast.next;
//         }

//         return slow;
//     }

//     public static void main(String[] args) {

//         // Create nodes
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);
//         head.next.next.next.next = new Node(50);

//         head.next.next.next.next.next = head.next.next;

//         Node result = findCycleStart(head);

//         if (result != null) {
//             System.out.println("Cycle starts at node: " + result.data);
//         } else {
//             System.out.println("No cycle");
//         }
//     }
// }
}



 




        

     

    
