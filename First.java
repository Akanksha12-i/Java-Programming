class First{

public static void main(String[] args){
System.out.println("Hello world");

int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    if(i!=n){
    for(int j=1;j<=2*i-1;j++){
        if(j==1 || j==(2*i-1))
        System.out.print("*");
        else
        System.err.print(" ");
    }
}else{
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
}
   
}
System.out.println();
}

char x[]={'a','u','o'};
String y=new String(x);
System.out.println(y);
}
}

