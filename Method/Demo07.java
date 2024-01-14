package Method;

public class Demo07 {

    public static void printValue(int i){
        System.out.println("i : "+i);
        printValue(++i);

    }
    public static void main(String[] args) {
        printValue(0);
    }
}
//StackOverFlowError