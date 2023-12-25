package Random;

import java.util.Random;

class Demo05 {
    public static void main(String[] args) {
        Random input = new Random();
        for (int i = 0; i < 200; i++) {
            int num = input.nextInt(100);
            System.out.println("Enter Value -: "+num);
            if (num ==99){
                break;
            }
                System.out.println(num);
        }
    }
}



