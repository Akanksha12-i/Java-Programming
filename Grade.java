import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks=sc.nextInt();

        if(marks>=90 && marks<=100){
          System.out.println("Grade: A");
        }else if(marks>=75 && marks<90){
            System.out.println("Grade: B");
          }else if(marks>=50 && marks<75){
            System.out.println("Grade: C");
          }else if(marks>=35 && marks<50){
            System.out.println("Grade: D");
          }else if(marks>=0 && marks<35){
            System.out.println("Grade: F");
          }else 
          System.out.println("Invalid Input of marks......");
    }
}
