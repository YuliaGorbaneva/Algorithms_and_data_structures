package Seminar4;

public class BinTree {

    public static void main(String[] args) {
        BinTree tree = new BinTree();

        tree.add(5);
        tree.add(1);
        tree.add(8);
        tree.add(7);
        tree.add(6);
        tree.add(2);
        tree.add(0);

        System.out.println("BinTree origin");
        printTree(tree.root);

        System.out.println("BinTree after rotate");
        tree.root = tree.rotateRight(tree.root);
        printTree(tree.root);
    }

    Node root;

    public boolean add(int value) {
        if (root == null) {
            root = new Node(value);
            root.color = Color.black;
            return true;
        }
        if (addNode(root, value) != null)
            return true;
        return false;

    }

    private Node addNode(Node node, int value) {
        if (node.value == value)
            return null;
        if (node.value > value) {
            if (node.left == null) {
                node.left = new Node(value);
                return node.left;
            } else
                return addNode(node.left, value);
        } else {
            if (node.right == null) {
                node.right = new Node(value);
                return node.right;
            } else
                return addNode(node.right, value);
        }
    }

    public boolean contain(int value) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.value == value)
                return true;
            if (currentNode.value > value)
                currentNode = currentNode.left;
            else
                currentNode = currentNode.right;
        }
        return false;
    }

    private Node rotateLeft(Node node) {
        Node right = node.right;
        node.right = right.left;
        right.left = node;
        return right;
    }

    private Node rotateRight(Node node) {
        Node left = node.left;
        node.left = left.right;
        left.right = node;
        return left;
    }

    private void flipColors(Node node) {
        node.color = Color.red;
        node.left.color = Color.black;
        node.right.color = Color.black;
    }

    private static void printTree(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + "color:" + node.color);
        if (node.left != null) {
            System.out.println("Left children" + node.left.value);
        }
        if (node.right != null) {
            System.out.println("Right children" + node.right.value);
        }
        printTree(node.left);
        printTree(node.right);
    }

    private class Node {
        int value;
        Node left;
        Node right;
        Color color;

        Node() {
            this.color = Color.red;
        }

        Node(int _value) {
            this.value = _value;
            this.color = Color.red;
        }
    }

    enum Color {
        red, black
    }
}
