package Random;

public class Demo08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("For looop : " + i);
        }

        System.out.println();

        int j = 1;
        while (j <= 10) {
            System.out.println("While loop : " + j);
            j++;
        }

        System.out.println();

        int k =1;
        do {
            System.out.println("do-while loop : "+k);
            k++;

        }while (k<=10);
    }
}
