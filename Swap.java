class Swap {
    public static void main(String[] args) {

        // using third variable or temporary variable...
        int a=90;
        int b=80;
        int c;

        System.out.println("Before Swapping");
        System.out.println("a="+a+", b="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping");
        System.out.println("a="+a+", b="+b);

        // Without using third variable or temporary variable...
        int x=10;
        int y=20;
        System.out.println("______Swap without third variable use_________");
        System.out.println("Before Swapping");
        System.out.println("x="+x+", y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping");
        System.out.println("x="+x+", y="+y);
    }
}
