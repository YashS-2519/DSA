public class J {
  public static void main(String[] args) {
    
    int length = 5;

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if((i == 0 || j == 2) || (i == length - 1 && j < 3) || (i == 3 && j == 0))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

  }
}
