class Node{
    int val;
    Node next;
    Node(int val){
       this.val=val;
    }

}
class Linkedlist{
     Node head;
     Node tail;
     int size;

      void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null)head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
     }

     void addAtHead(int val){
    Node temp=new Node(val);
        if(head==null)head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    } 


    void display(){
    if(head==null)return;
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
    }
    System.out.println();
}

void deleteAtHead(){
    if(head==null){
            System.out.print("List is Empty");
            return;
    }
       head=head.next;
    if(head==null)tail=null;
    size--;
}
void delete(int idx){
    if(idx<0|| idx>=size){
        System.out.println("Invalid Index!");
        return;
    }
    if(idx==0){
        deleteAtHead();
        return;
    }
    Node temp=head;
    for(int i=1;i<=idx-1;i++){
        temp=temp.next;
    }
    temp.next=temp.next.next;
    if(idx==size-1) tail=temp;
    size--;

}
}

public class lloperations{
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.addAtTail(10);ll.display();
        ll.addAtTail(20);ll.display();
        ll.addAtTail(30);ll.display();
        ll.addAtTail(40);ll.display();
        ll.addAtHead(50);ll.display();
        ll.deleteAtHead();ll.display();
        System.out.println(ll.size);
       ll.delete(3);ll.display();
    }
}