public class Main {

    static class Node {
        int petID;
        Node left, right;

        Node(int id) {
            petID = id;
        }
    }

    static Node insert(Node root, int id) {
        if (root == null) return new Node(id);

        if (id < root.petID)
            root.left = insert(root.left, id);
        else
            root.right = insert(root.right, id);

        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.petID + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 101);
        root = insert(root, 205);
        root = insert(root, 150);

        System.out.println("Pet Records:");
        inorder(root);
    }
}
