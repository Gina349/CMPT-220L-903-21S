package Assignment_4;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        summation(a);
    }
    static int summation(int[] a) {
        int total = 0;
        for (int number : a)
            total += number;
        System.out.println("This value is: " + total);
        return total;


    }
}


