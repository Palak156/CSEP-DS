class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class bst {
    Node root;

    // Insert a node
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        bst tree = new bst();

        tree.root = tree.insert(tree.root, 1);
        tree.insert(tree.root, 3);
        tree.insert(tree.root, 9);
        tree.insert(tree.root, 4);
        tree.insert(tree.root, 6);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 7);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
    }
}


