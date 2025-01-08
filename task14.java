import java.util.Scanner;

public class task14 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < 3; j++) {
                rowSum += array[i][j];
                colSum += array[j][i];
            }

            minSum = Math.min(minSum, Math.min(rowSum, colSum));
        }

        System.out.println(minSum);
    }
}
