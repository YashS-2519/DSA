public class F {
  public static void main(String[] args) {
    
    int length = 5;

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if(i == 0 || i == 2 || j == 0)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

  }
}
