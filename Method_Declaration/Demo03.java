package Method_Declaration;
public class Demo03 {
    public static void main(String[] args) {
        //myMethod(); //Illegal
        Demo03 obj = new Demo03();
        obj.myMethod();
    }

    public void myMethod() {
        System.out.println("\"Hello!!! Not static Method in to One class\"");
    }
}
