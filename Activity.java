import java.util.Scanner;
class Activity {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1.
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        System.out.println(num%5==0?"Lucky Number":"");
        //2.
        System.out.println("Enter any character:");
        int ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z' ||(ch>='A' && ch<='Z')){
            System.out.println("Alphabet");
        } else if(ch>='0' && ch<='9'){
            System.out.println("Number");
        } else 
        System.out.println("Special Character");

        //3.
        System.out.println("Enter any 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            if(a>c)
            System.out.print(a);
            else
            System.out.print(c);
        }else{
            if(b>c)
            System.out.print(b);
            else
            System.out.print(c);
        }
        System.out.println(" is largest.");


       
    }
}