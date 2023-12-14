package Basic;

public class Demo04 {
    public static void main(String[] args) {
        int x = 100;
        double y = 34.23;
        char ch = 'A';
        String name = "Supun";
        Boolean ok = true;
        double d = 23.45;

        System.out.printf("%d\n", x);
        System.out.printf("%f\n", y);
        System.out.printf("%c\n", ch);
        System.out.printf("%s\n", name);
        System.out.printf("%b\n", ok);
        System.out.printf("My Salary is : %f Rs..\n", d);
        System.out.printf("%60f\n", d);//Width
        System.out.printf("%20.5f\n", d);//.2 --> 0.00
        System.out.printf("%-20.5f\n", d);//alignment

    }
}
