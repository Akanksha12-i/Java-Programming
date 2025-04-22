//WJP to check given number is multiple of 5 and 7 .
class Logical{

    
    public static void main(String[] args){
        int a=35;
        //and
    System.out.println(a%5==0 && a%7==0);
    //or
    int n=36;
    System.out.println(n%5==0 || n%7==0);

    //wjp to check given year is leap year or not
    int y1=1900;
    int x=2004;
    int w=2000;
    int z=1998;
    System.out.println("Leap year or not for year:-"+y1+","+x+","+w+","+z);
    System.out.println((y1%4==0 && y1%100!=0 ) || y1%400==0); //false
    System.out.println((x%4==0 && x%100!=0 ) || x%400==0);  //true
    System.out.println((w%4==0 && w%100!=0 ) || w%400==0);  //true
    System.out.println((z%4==0 && z%100!=0 ) || z%400==0);   //false

    
    }
    
    }