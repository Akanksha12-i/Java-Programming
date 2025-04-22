import java.util.ArrayList;
class A {
    int a = 10;
}

class B extends A {
    int b = 20;
}

class C extends A {
    int c = 30;
}

class D extends B {
    int d = 50;
}

class E extends D {
    int e = 50;
}

class F extends E {
    int f = 60;
}

class G extends F {
    int g = 70;
}

class H extends F {
    int h = 80;
}

/*public class Drive {
    public static void main(String[] args) {
        E e1 = new E();
        System.out.println(e1 instanceof C); 
      
    }
}*/

public class Drive {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 20;
        
        if ((num2 = 5) == num1) {
            System.out.print(num2);
        } else {
            System.out.print(++num2);
        }

       
                byte b = 127;
                b++;  // Increment b by 1 (b = 128)
                b++;  // Increment b by 1 (b = 129)
                System.out.println(b);  // Prints the final value of b
            
        
        
    }
}

