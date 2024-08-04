public class D {
  public static void main(String[] args) {
    
    int length = 5;

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if( j == 0 || ((i == 0 || i == length - 1) && j != length - 1 ) || ((i > 0 && i < 4) && j == length - 1))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

  }
}
