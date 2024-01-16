package Static_Globle_Template;

public class Demo01 {
    public static int globalVariable = 90;

    public static int localVariable() {
        int t = 45;
        return t;
    }

    public static void main(String[] args) {
        System.out.println("Local Variable : " + localVariable());
        System.out.println("Global Variable : " + globalVariable);
    }
}
