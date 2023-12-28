package Method_Declaration;

 public class Demo04 {
    public static void main(String[] args) {
        //myMethod();//Illegal
        Example ob = new Example();
        ob.myMethod();
    }
}


  class Example{
    public void myMethod(){
        System.out.println("Hello My Interface!!!");
    }

}