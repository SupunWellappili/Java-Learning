package Variable;

public class Demo11 {
    public static void main(String[] args) {
        int tap;
        int count = 560;
        do {
            tap = count;
            count++;
            System.out.println(tap);//Legal
        } while (count < 1000);

        System.out.println("*"+tap);//Legal

    }
}
