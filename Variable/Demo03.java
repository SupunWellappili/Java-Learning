package Variable;

public class Demo03 {
    public static void main(String[] args) {
        int x;
        x = 100;
        System.out.println(x);

        int y;
        {
            x=500;
            y=200;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
