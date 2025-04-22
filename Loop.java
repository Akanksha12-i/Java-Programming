 class Loop {
  int a = 20;

  public void test() { 
      System.out.println(a); 
  }

  { 
      a = 10; 
      test(); 
  }
  public static void main(String[] args) {
    System.out.println("java"); 
    /*int num=70;
    if((num=5) !=5){
      System.err.println("false");
    }else
    System.out.print("true");*/
  }    
}
