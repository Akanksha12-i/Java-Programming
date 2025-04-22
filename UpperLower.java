import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphaber in any case: ");
        char c = sc.next().charAt(0);
        if ((c >= 97 && c <= 'z')) {
            System.out.println("LOWERCASE....");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("Uppercase");
            char c2 = (char) (c + 32);
            System.out.println(c + "'s lowercase form: " + c2);
        } else {
            System.out.println("Invalid Character Input!!");
        }
    }
}
