package Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int[] xr = new int[12];
        double[] dr = new double[32];

        //Array element
       // xr[0] = dr[0];//Illegal
        dr[0]=xr[0];//Wider Conversion
         xr[0] = (int)dr[0];//Narrow Casting

        //Array Reference
       //xr=dr;//Illegal
       // dr=xr;//Illegal

    }
}
