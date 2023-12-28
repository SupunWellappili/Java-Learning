package Activities;
public class Demo06 {

    public static int increment(int x){
        System.out.println("3x -: "+x);
        x++;
        System.out.println("4x -: "+x++);
        return x;
    }
    public static void main(String[] args) {
        int x = 100;
        System.out.println("1x -: "+x);
        x++;
        System.out.println("2x -: "+x);
        increment(x);
        System.out.println("5x -: "+x);
        int y = increment(x);
        System.out.println("6x -: "+y);

    }
}
