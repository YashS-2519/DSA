public class M {
  public static void main(String[] args) {
    
    int length = 5;

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if((j == 0 || j == length - 1) || (i == 1 && (j == 1 || j == 3) || (i == 2 && j == 2)))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

  }
}
