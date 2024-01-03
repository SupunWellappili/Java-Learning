package Arrays_Declaration;

public class Demo04 {
    public static void main(String[] args) {
        int[] xr = new int[3];
        int[] yr = new int[12];

        for (int i = 0; i < 10; i++) {
          //  xr[i] = i; //ArrayIndexOfBoundException(Runtime_Exception)
            yr[i] = i;//Legal
        }
    }
}
