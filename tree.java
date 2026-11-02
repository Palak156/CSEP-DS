import java.util.ArrayList;
class Node{
    int data;
    Node left;
    Node right;

    Node(int x){
        data=x;
        left=right=null;
    }
}

public class tree {

    public static void Inorder(Node node,ArrayList<Integer> res){
          if(node==null) return;
          Inorder(node.left,res);
          res.add(node.data);
         Inorder(node.right,res);
    }

     public static void Preorder(Node node,ArrayList<Integer> res){
        if(node==null) return;
        res.add(node.data);
        Preorder(node.left,res);
        Preorder(node.right,res);
    }
    
     public static void Postorder(Node node,ArrayList<Integer> res){
        if(node==null) return;
        Postorder(node.left,res);
        Postorder(node.right,res);
        res.add(node.data);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
         root.right=new Node(3);
          root.left.left=new Node(4);
           root.left.right=new Node(5);
            root.right.right=new Node(6);
        
        ArrayList<Integer> res = new ArrayList<>();
        // Inorder(root, res);
        // Preorder(root,res);
        Postorder(root,res);

        for(int node : res)
            System.out.print(node + " ");

    }
}
