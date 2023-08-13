package Seminar3;

public class Main {
    public static void main(String[] array) {
        LinkedList list = new LinkedList();

        list.add(5);
        list.add(2);
        list.add(9);
        list.add(0);
        list.add(-4);

        // list.remove(5);
        // list.remove(9);
        // list.remove(12);
        // boolean flag = list.remove(12);
        // list.remove(12);
        // System.out.print(list.getValue(2));
        // list.addAt(-1, 4);
        list.print();
        list.reverse();
        list.print();
        // System.out.print(flag + " ");

        // list.print();
    }

}
