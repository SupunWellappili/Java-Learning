package Method_Declaration;

 class Demo01 {
    public static void main(String[] args) {
        myMethod();
        Demo01.myMethod();
        myClass.myMethod();
    }

    public static void myMethod() {
        System.out.println("Hello C++");

    }
}


class myClass {
    public static void myMethod() {
        System.out.println("Hello C#");
    }
}


