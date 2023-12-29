package Return;
public class Demo01{
    public static void main(String args[]) {
        getting(99);
        System.out.println("----------------------");
        getting(101);
    }

    public static void getting(int x) {
        System.out.println("A");
        System.out.println("B");
        if (x > 100) {
            return;
        }
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
    }
}