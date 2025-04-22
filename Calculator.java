import java.util.Scanner;
class Calculator {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1=sc.nextInt();

        System.out.println("Enter second number:");
        int num2=sc.nextInt();

        System.out.println("Enter choice:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice=sc.nextInt();
       

        switch(choice){
            case 1:
            System.out.println(num1+"+"+num2+"= "+(num1+num2));
            break;
            case 2:
            System.out.println(num1+"-"+num2+"= "+(num1-num2));
            break;
            case 3:
            System.out.println(num1+"*"+num2+"= "+(num1*num2));
            break;
            case 4:
            System.out.println(num1+"/"+num2+"= "+(num1/num2));
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}