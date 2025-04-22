import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter a byte value:");
        byte bt=sc.nextByte();
        System.out.println(bt);

        System.out.println("Enter a short value:");
        short sh=sc.nextShort();
        System.out.println(sh);

        System.out.println("Enter a int number:");
        int a=sc.nextInt();
        System.out.println(a);

        System.out.println("Enter a float value:");
        float b=sc.nextFloat();
        System.out.println(b);

        System.out.println("Enter a double value:");
        double d=sc.nextFloat();
        System.out.println(d);

        System.out.println("Enter a boolean value:");
        boolean bl=sc.nextBoolean();
        System.out.println(bl);

        System.out.println("Enter a character:");
        char c=sc.next().charAt(0);
        System.out.println(c);

        System.out.println("Enter a single string:");
        String st=sc.next();
        System.out.println(st);
        
        System.out.println("Enter a multi-word string:");
        sc.nextLine(); //--use 1st time to avoid the Enter input from previous input.
        String m=sc.nextLine(); //--this 2nd time is used to take input..
        System.out.println(m);
    }
}
