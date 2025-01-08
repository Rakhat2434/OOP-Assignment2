import java.util.Scanner;
public class task7 {
    public static String[] strings = new String[6];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < 6; i++) {
            String nn = strings[i];
            for (int j = i + 1; j < 6; j++) {
                if (nn.equals(strings[j])) {
                    strings[i] = "null";
                    strings[j] = "null";
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
