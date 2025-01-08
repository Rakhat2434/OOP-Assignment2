import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long b = cube(a);
    System.out.println(b);
    }
    public static long cube(int a) {
        int b = a * a * a;
        return b;
    }
}

