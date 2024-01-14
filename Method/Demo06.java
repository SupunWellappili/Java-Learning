package Method;

public class Demo06 {

    public static void printValue(){
        System.out.println("Start");
        printValue();
        System.out.println("End");
    }
    public static void main(String[] args) {
        printValue();
    }
}
//stack overflow error

