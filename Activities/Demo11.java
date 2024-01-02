package Activities;

public class Demo11 {

    public static int reverse(int num) {
        int rev = num % 10;
        while ((num /= 10) != 0) {
            rev *= 10;
            rev += num % 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }


    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }
}