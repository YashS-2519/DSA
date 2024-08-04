public class LeftUpperAndLowerTriangle {

  public static void main(String[] args) {

    int length = 9;

    for (int i = 0; i < length; i++) {

      // for upper half
      for(int j = 0; j <= i && i < 5; j++){
        System.out.print("*");
      }

      // for lower half
      for (int j = 0; j < length - i && i > 4; j++) { 
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
