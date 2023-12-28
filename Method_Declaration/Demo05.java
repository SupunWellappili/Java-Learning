package Method_Declaration;

public class Demo05 {

    public static void main(String[] args) {
        Demo05 ob = new Demo05();
        int x = 100;
        int y = 2300;
        System.out.println(x + " : " + y);
        int xx = ob.getting(x, y);
        System.out.println(x + " : " + y + " --> " + "New X :" + xx);
    }

    public int getting(int x, int y) {
        System.out.println("Class to Class");
        System.out.println(x + " : " + y);
        x++;
        return x;
    }
}
