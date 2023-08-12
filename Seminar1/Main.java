package Seminar1;

public class Main {

    public static void main(String[] array) {

        Node n1 = new Node(5);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(9);
        Node n5 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        // n5.next = n1;

        Node currentNode = n1;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }

        // System.out.print(n1.value);
        // System.out.print(n1.next.value);
        // System.out.print(n1.next.next.value);
        // System.out.print(n1.next.next.next.value);
        // System.out.print(n1.next.next.next.next.value);

        // House my = new House();
        // House their = new House();
        // // Color col = Color.Green;
        // // Color col2 = Color.White;

        // my.street = "Kolomtnskay 14";
        // my.floorCount = 3;
        // my.color = Color.Yellow;
        // my.height = 10;

        // System.out.println(my.color);

        // my.burn();

        // System.out.println(my.color);

        // their.street = "null";
        // their.color = Color.White;
        // their.floorCount = 1;
        // their.height = 4;
    }
}
