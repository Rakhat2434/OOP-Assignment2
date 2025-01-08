import java.util.Scanner;

public class task16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        array = new char[height][2 * height - 1];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                if (j >= height - i - 1 && j <= height + i - 1) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
