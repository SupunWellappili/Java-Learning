package Variable;

public class Demo10 {
    public static void main(String[] args) {
        int sum;
        for (int i = 0; i < 10; i++) {
            sum = i;
            System.out.println(sum);//Legal
        }
        // System.out.println(sum);//Illegal

        //------------------------------------

        int select;
        int j = 40;

        while (j < 100) {
            select = j;
            j++;
            System.out.println(select);
        }

        // System.out.println(select);//Illegal

    }
}