//1.
/*
import java.util.Scanner;
class Jan3A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers(to find the maximum):");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans= a>b?a:b;
        System.out.println(ans+" is larger value");
        
    }
}*/

//2.
/*
import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a%2==0?"Even":"Odd");
    }
}*/

//3.
/*import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ab=(a>0?a:0-a);
        System.out.println("absolute of "+a+" is: "+ab);
    }
}*/

//4.
/*import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a>0?"Positive":(a<0?"Negative":"Zero"));
    }
}*/

//5.
/*import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a>=90?"A":(a>=80?"B":(a>=60?"C":(a>=50?"D":(a>=40?"F":"Fail")))));
    }
}*/

//6.
/*
import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans=(a<b?(a<c?a:c):(b<c?b:c));
        System.out.println(ans+" is smallest");
    }
}*/

//7.
/*import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter a year:");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        
        boolean ans=(year%4==0 && year%100!=0) || year%400==0;

        System.out.println(ans?"Yes, leap year":"No, leap year");
    }
}*/

//8.
/*
import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        System.out.println(a>0?"Positive":(a<0?"Negative":"Zero"));
    }
}*/

//9.
/*import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter 2 strings");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(a.equals(b)?"Same:)":"Not Same!!");
    }
}*/

//10.
/*
import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a>=18?"Eligible to vote":"Not Eligible to vote!!");
    }
}*/

//11.
/*import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter price");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a>100?"Applied 10% discount:)":"Discount not applied!!");
    }
}*/

//12.
/*import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter temperature(in celsius):");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int tem=a>0?(a*9/5)+32:a+273;
        String s=a>0?"F":"K";
        System.out.println(tem+s);
    }
}*/

//13.
/*import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        System.out.println(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'?"Vowel":"Consonant");
    }
}*/

//14.
/*
import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter color(red,yellow or green):");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a.equals("red")?"Stop":(a.equals("yellow")?"Ready":"Go"));
    }
}*/

//15.
/*import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        System.out.println("Enter month(jan,feb etc.) number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a>=2 && a<=4?"Spring":(a>=5 && a<=7?"Summer":(a>=8 && a<=10?"Autumn":"Winter")));
    }
}*/

//Program to find ar of rect square triangle, vol, ar of circle, perimeter of rect
import java.util.Scanner;
class Jan3A{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter len and width of rectangle:");
        int reclen=sc.nextInt();
        int recwid=sc.nextInt();

        System.out.println("Enter length of Square:");
        int sqlen=sc.nextInt();

        System.out.println("Enter base and height of triangle:");
        int tri_base=sc.nextInt();
        int tri_heigth=sc.nextInt();

        System.out.println("Enter radius of Circle:");
        int radius=sc.nextInt();

        System.out.println("Area of rectangle: "+(reclen*recwid));
        System.out.println("Area of Square: "+(sqlen*sqlen));
        System.out.println("Area of Circle: "+(3.14*radius));
        System.out.println("Area of Triangle: "+(0.5*tri_base*tri_heigth));
        System.out.println("Perimeter of rectangle: "+(0.5*(reclen+recwid)));
       
    }
}




