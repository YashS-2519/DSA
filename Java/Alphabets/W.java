public class W {
  public static void main(String[] args) {
    
    int length = 5;

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if((j == length - 1 || j == 0) || (i == length - 2 && (j == length - 2 || j == 1) || (i == 2 && j == 2)))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

  }
}
