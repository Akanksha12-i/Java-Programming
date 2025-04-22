import java.util.Scanner;
class NumberCay {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day number:");
        int num=sc.nextInt();

        switch(num){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid");
        }

        System.out.println("Enter a Month number:");
        int num2=sc.nextInt();
        switch(num2){
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("February");
            break;
            case 12:
            System.out.println("Decenmer");
            break;
            default:
            System.out.println("Invalid");
        }

    }
}
