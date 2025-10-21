import java.lang.Math;

public class ComparacaoArvores {

    public static void main(String[] args) {
        int[] elementos = {1, 2, 3, 10, 4, 5, 9, 7, 8, 6};

        BinarySearchTree bst = new BinarySearchTree();
        for (int el : elementos) {
            bst.insert(el);
        }

        AVLTree avl = new AVLTree();
        for (int el : elementos) {
            avl.insert(el);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("ÁRVORE BINÁRIA DE BUSCA (BST) - NÃO BALANCEADA");
        System.out.println("-------------------------------------------------");
        bst.printTree();

        System.out.println("\n\n-------------------------------------------------");
        System.out.println("ÁRVORE AVL - AUTO-BALANCEADA");
        System.out.println("-------------------------------------------------");
        avl.printTree();
    }
}

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void printTree() {
        printTreeUtil(root, 0);
    }

    private void printTreeUtil(Node node, int space) {
        int COUNT = 5; 
        if (node == null) {
            return;
        }
        space += COUNT;

        printTreeUtil(node.right, space);

        System.out.print("\n");
        for (int i = COUNT; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(node.key);

        printTreeUtil(node.left, space);
    }
}

class AVLNode {
    int key, height;
    AVLNode left, right;

    AVLNode(int d) {
        key = d;
        height = 1; 
    }
}

class AVLTree {
    AVLNode root;

    private int height(AVLNode N) {
        if (N == null)
            return 0;
        return N.height;
    }

    private void updateHeight(AVLNode N) {
        if (N != null) {
            N.height = Math.max(height(N.left), height(N.right)) + 1;
        }
    }

    private int getBalance(AVLNode N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        updateHeight(y);
        updateHeight(x);