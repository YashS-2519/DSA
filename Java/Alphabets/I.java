public class I {
  public static void main(String[] args) {
    
    int length = 5;

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if(i == 0 || i == length - 1 || j == 2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

  }
}
