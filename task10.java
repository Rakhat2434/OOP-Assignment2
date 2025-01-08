import java.util.Scanner;

public class task10 {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        multiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            int length = sc.nextInt();
            multiArray[i] = new int[length];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
