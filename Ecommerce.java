import java.util.Scanner;
public class Ecommerce {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter age of Person (more than 14 only...)");
    int age=sc.nextInt();
    System.out.println("Enter purchase price: ");
    double price=sc.nextInt();
    double price2=0;
    double price3=0;
    boolean pay=false;
    boolean ageval=true;

    if(age>=15 && age<20){
        
        price2=(95*price)/100;
        if(price>5000){
        price3=(95*price2)/100;
        pay=true;
        }
    }else if(age>=20 && age<=29){
        
        price2=(94*price)/100;
        if(price>4000){
        price3=(94*price2)/100;
        pay=true;
        }
    }else if(age>29){
        price2=(85*price)/100;
    }else{
        ageval=false;
        System.out.println("Invalid input of age!!");
    }

    if(ageval==true){
        System.out.println("Initial Price: "+price);
        System.out.println("Price after discount: "+price2);
        if(pay==true)
        System.out.println("Discounted amount: "+price3);
    }



    }
}
