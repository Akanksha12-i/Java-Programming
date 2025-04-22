
class ExampleInDec {
    public static void main(String[] args){

        /*int a=10, b=20;
        int c= a++ + --b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

        int a=10, b=20;
        int c= a++ - --a + b++ +--a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int a1=5, b1=10, c1=15;
        int d1= ++a1 + b1-- - c1++ +2;
        System.out.println(a1+" "+b1+" "+c1+" "+d1);

        int a2=7, b2=3, c2=9;
        int d2= c2-- + ++a2 - b2++ -1;
        System.out.println(a2+" "+b2+" "+c2+" "+d2);

        int a3=2, b3=8, c3=6;
        int d3= a3++ + --c3 + b3-- - 4;
        System.out.println(a3+" "+b3+" "+c3+" "+d3);
       
        int a4=9, b4=2, c4=3;
        int d4= b4-- - --c4 + ++a4 -5;
        System.out.println(a4+" "+b4+" "+c4+" "+d4);

        //Conditional operator
        int x=10;
        int y=20;
        System.out.println(x>y? "a is greater" : 10);
        }
  
}
