package Controller.Switch;

public class Demo01 {
    public static void main(String[] args) {
        int sum;
        for (int i = 0; i < 10; i++) {
            sum = i;
            System.out.println(sum);//Legal
        }
       // System.out.println(sum);//Illegal
    }
}
