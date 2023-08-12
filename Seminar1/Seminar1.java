package Seminar1;

// import java.math.BigInteger;

public class Seminar1 {
    public static void main(String[] args) {
        // int a = 5;
        // double b = 5.5;
        // float c = 6.9f;
        // BigInteger big = new BigInteger(a, null, a, a);
        // boolean flag = true;
        // String str = "Hello World!";
        // char v = '*';

        // System.out.println(b);
        // int n = 5;
        // if (5 > 2) {
        // System.out.println(5);

        // int[] array = new int[] { 2, 3, 4, 5, 6 };
        // System.out.print(find(array, n));
        // }
        System.out.println(fibonachiLine(20));

        System.out.println(fibonachiRecursive(20));
    }

    public static int fibonachiRecursive(int n) {
        return fibonachiRecursive2(n, 0, 1);
    }

    public static int fibonachiRecursive2(int n, int left, int right) {
        if (n == 1) {
            return right;
        }
        return fibonachiRecursive2(n - 1, right, left + right);
    }

    public static int fibonachiLine(int n) {
        int left = 0;
        int right = 1;
        if (n < 3) {
            if (n == 2) {
                return 1;
            } else if (n == 1) {
                return 0;
            } else {
                return -1;
            }
        }
        for (int i = 1; i < n; i++) {
            right = left + right;
            left = right - left;
        }
        return right;
    }

    public static int find(int[] array, int valeu) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valeu) {
                return i;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int length = array.length;
        for (int k = 0; k < array.length - 1 && !isSorted; k++) {
            isSorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
                length--;
            }
        }
    }
}
