import java.util.Scanner;
class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int x=num;
      int cnt=0;
      while( num>0){
          num/=10;
          cnt++;
      }
      System.out.println("Number of digits in:"+x+" is: "+cnt);
    }    
  }
  