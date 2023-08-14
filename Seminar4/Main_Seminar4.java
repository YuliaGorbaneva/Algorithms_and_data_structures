package Seminar4;

public class Main_Seminar4 {
    public static void main(String[] args) {

        // String str1 = "ABC";
        // String str2 = "abc";

        // if (str1.compareTo(str2) > 0) // str1 > str2
        // System.out.println("TRUE");
        // else
        // System.out.println("FALSE");

        // String a = "5";
        // String b = "3";
        // String c = "11";
        // String d = "7";

        // System.out.println(a.hashCode());
        // System.out.println(b.hashCode());
        // System.out.println(c.hashCode());
        // System.out.println(d.hashCode());

        HashTable<Integer, String> table = new HashTable<>();

        table.add(0, "Hello");
        table.add(4, "Zdraste");
        table.add(5, "World");
        // table.add(8, "Privet");
        // table.add(7, "Zdrastrrre");
        // table.add(2, "Zdrafsdadsasdssste");

        table.print();

        System.out.println(table.getSize());
        System.out.println(table.getLenght());
        // System.out.println(table.getValue("World"));

    }
}
