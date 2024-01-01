package Return;

public class Demo06 {
    public static void findGrade(int x,int y){
        int tot = x+y;
        System.out.println("Total : "+tot);
    }

    public static int myMethod(int a, int b){
        int totally = a+b;
        return totally;

    }
    public static void main(String[] args) {
        findGrade(10,20);
        System.out.println("Totally : "+myMethod(40, 60));
    }
}
