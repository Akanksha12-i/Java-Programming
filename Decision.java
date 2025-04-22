 //if - Statement
 /*import java.util.Scanner;
 class Decision {
  public static void main(String[] args) {
    System.out.println("Main Start!!");
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter age");
    int age=sc.nextInt();
    if(age>18)
    {
        System.out.println("Age is greater than 18.");
    }
    System.out.println("Main end!!");
  }    
}*/

//if else - Statement
import java.util.Scanner;
class Decision {
 public static void main(String[] args) {
   System.out.println("Main Start!!");
   Scanner sc= new Scanner(System.in);
   
   System.out.println("Enter a number");
   int num=sc.nextInt();
   if(num%2==0)
   {
       System.out.println("Even");
   }else{
    System.out.println("Odd");
   }
   System.out.println("Main end!!");
 }    
}

