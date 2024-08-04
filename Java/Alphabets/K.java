public class K {
  public static void main(String[] args) {
    
    int length = 5;

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if(j == 0 || (i == 2 && j < 3) || ((i == 0 || i == length - 1) && j == length - 1) || ((i == 1 || i == 3) && j == length - 2 ))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

  }
}
