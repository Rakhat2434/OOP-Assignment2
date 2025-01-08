import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        signIn(a);
    }
    public static void signIn(String username) {
        if(username.equals("user")){
            return;
        }
    System.out.println("Welcome " + username);
    System.out.println("Missed you very much, " + username);
    }
}
