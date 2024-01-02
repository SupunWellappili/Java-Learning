package Overloading;

public class Demo03 {
    public static void main(String[] args) {
            myMethod.myFirstMethod(100);
            myMethod.mySecoundMethod(230.54);
    }
}

class myMethod{
    public static void myFirstMethod(int num){
        System.out.println("1st Int----> "+num);
        return ;
    }

    public static void mySecoundMethod(double num){
        System.out.println("1st Int----> "+num);
        return ;
    }
}
