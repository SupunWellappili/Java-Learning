package Multi_Dimensional_Arrays;

public class Demo04 {

    public static void printArray(int[] zz){
        System.out.print("[");
        System.out.print(zz[0]+", ");
        System.out.print(zz[1]+", ");
        System.out.print(zz[2]+", ");
        System.out.print(zz[3]+", ");
        System.out.print(zz[4]+", ");
        System.out.print("\b\b]");
    }
    public static void main(String[] args) {
        int[] ar ={10,20,30,40,50};
        printArray(ar);
    }
}
