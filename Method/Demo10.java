package Method;

public class Demo10 {
    public static void printTotal(int... ar) {
        int tot = 0;
        for (int a : ar) {
            System.out.print(a + "+");
            tot += a;
        }
        System.out.println("\b=" + tot);
    }

    public static void main(String[] args) {
        printTotal(new int[]{10, 20});//arrys send ok
        printTotal(new int[]{10, 20, 30});

    }
}

  //  public static void printToal(int xr)  // para metar variable
  //  public static void printTotal(int[] xr)  // Array reference variable
 //   public static void printTotal(int… xr)  // Array Argument variable //Array references nethuwa unath refer krnna puluwan

