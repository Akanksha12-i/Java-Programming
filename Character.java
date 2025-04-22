import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any character: ");
        char c=sc.next().charAt(0);
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            System.out.println("Alphabet.....");
        }else if(c>='0' && c<='9'){
            System.out.println("Number");
        }else{
            System.out.println("Special Character");
        }
    }
}
