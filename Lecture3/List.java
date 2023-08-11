package Lecture3;

public class List {
    Node head;
    Node tail;

    public void push(int valeu) {
        Node node = new Node();
        node.valeu = valeu;
        node.next = head;
        head.previous = node;
        head = node;
    }

    public Integer peek() {
        Integer result = null;
        if (tail != null) {
            result = tail.valeu;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }

    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.valeu;
            head = head.next;
        }
        return result;

    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;

    }

    // public void add(int valeu) {
    // Node node = new Node();
    // node.valeu=valeu;
    // if(head==null){
    // head = node;
    // tail = node;
    // }else{
    // tail.next = node;
    // node.previous = tail;
    // tail = node;
    // }
    // }

    // public void add(int valeu, Node node) {
    // Node next = node.next;
    // Node newNode = new Node();
    // newNode.valeu = valeu;
    // node.next = newNode;
    // newNode.previous = node;
    // if (next == null) {
    // tail = newNode;
    // } else {
    // next.previous = newNode;
    // newNode.next = newNode;
    // }
    // }

    // public void delete(Node node) {
    // Node previous = node.previous;
    // Node next = node.next;
    // if (previous == null) {
    // next.previous = null;
    // head = next;
    // } else {
    // if (next == null) {
    // previous.next = null;
    // tail = previous;
    // } else {
    // previous.next = next;
    // next.previous = previous;
    // }
    // }
    // }

    // public Node find(int valeu) {
    // Node currentNode = head;
    // while (currentNode != null) {
    // if (currentNode.valeu == valeu) {
    // return currentNode;
    // }
    // currentNode = currentNode.next;
    // }
    // return null;
    // }

    // public void revert() {
    // Node currentNode = head;
    // while(currentNode!=null){
    // Node next = currentNode.next;
    // Node previous = currentNode.previous;
    // currentNode.next = previous;
    // currentNode.previous = next;
    // currentNode = next;
    // if (previous == null) {
    // tail = currentNode;
    // }
    // if (next == null) {
    // head = currentNode;
    // }
    // currentNode = next;
    // }
    // }

    public class Node {
        int valeu;
        Node next;
        Node previous;
    }
}
