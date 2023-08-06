package demo.tree;

public class BinaryTree {
     static Node root;

    public static void main(String[] args) {
        root = new Node(5);
        root.left = new Node(11);
        root.right = new Node(14);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.left.right.left = new Node(2);
        root.right.right = new Node(20);
        root.right.left = new Node(88);
        root.right.right.left = new Node(10);
        root.right.right.left.left = new Node(9);
        root.right.right.left.right = new Node(39);
        root.right.right.right = new Node(12);

        System.out.println("Неупорядкований обхід (Inorder traversal):");
        inorderTraversal(root);
        System.out.println();

        System.out.println("Обхід передупорядкований (Preorder traversal):");
        preorderTraversal(root);
        System.out.println();

        System.out.println("Обхід поступорядкований (Postorder traversal):");
        postorderTraversal(root);
        System.out.println();
    }

    private static void inorderTraversal(Node node){
        if (node != null){
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }

    private static void preorderTraversal(Node node){
        if (node != null){
            System.out.print(node.key + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    private static void postorderTraversal(Node node){
        if (node != null){
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }
}
