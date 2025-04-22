import java.util.Scanner;
class DecisionQues {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //Temperature
        System.out.println("Enter Temperature");
        int tem=sc.nextInt();
        if(tem<0){
            System.out.println("Temperature is below Freezing Point.");
        }else 
        System.out.println("Not below freezing point!!");

        //Leap year
        System.out.println("Enter Year");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("Leap year");
        }else 
        System.out.println("Not a leap year ");

        //Positive, Negative, Zero..
        System.out.println("Enter a number (for positive, negative and zero evaluation)");
        int a=sc.nextInt();
        if(a==0){
            System.out.println("Number is 0");
        }else if (a>0){
            System.out.println("Positive Number ");
        }else{
            System.out.println("Negative Number ");
        }
    
    //Divisibily by 5...
    System.out.println("Enter a number (Divisibility by 5)");
    int b=sc.nextInt();
    if(b%5==0){
        System.out.println(b+" is divisible by 5");
    }else 
    System.out.println(b+" is not divisible by 5");

     //Grade Calculator (Pass or Fail)
     System.out.println("Enter Marks:");
     int c=sc.nextInt();
     if(c>=40){
         System.out.println("PASS");
     }else 
     System.out.println("FAIL");

     //Able to vote
     System.out.println("Enter age:");
     int age=sc.nextInt();
     if(age>=18){
         System.out.println("Able to Vote!!");
     }else 
     System.out.println("Cannot Vote!!");

      //Greatest of two number....
      System.out.println("Enter Two different numbers..");
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      if(num1>num2){
          System.out.println(num1+" is greater than "+num2);
      }else 
      System.out.println(num2+" is greater than "+num1);

      //Vowel or Consonant
      System.out.println("Enter a character");
      char ch=sc.next().charAt(0);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
      ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
          System.out.println("Vowel");
      }else 
      System.out.println("Consonant");

      //Discount
      System.out.println("Enter Price..");
      int cost=sc.nextInt();
      if(cost>100){
          System.out.println("10% discount applied");
      }else 
      System.out.println("No discount applied");

      //Greatest of Three numbers....
      System.out.println("Enter 3 numbers:");
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      if(x>y){
         if(x>z)
         System.out.println(x+" is Greatest of the three above.");
         else
         System.out.println(z+" is Greatest of all three above.");
      }else {
        if(y>z)
        System.out.println(y+" is Greatest of the three above.");
        else
        System.out.println(z+" is Greatest of all three above.");
      }
     

      //Greatest of Three numbers....
      System.out.println("Enter weight and height of a person:");
      float w=sc.nextFloat();
      float h=sc.nextFloat();
      float bmi= w/(h*h);
      if(bmi>=18.5 && bmi<=24.9){
         System.out.println("Healthy wight");
      }else if (bmi>=25 && bmi<=29.9){
        System.out.println("Overweight");
      }else if (bmi<18.5){
        System.out.println("Underweight");
      }else
      System.out.println("Obese");


}
}
