package Variable;

class Demo01 {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(x);
        {
            int y = 200;
            System.out.println(x);
            System.out.println(y);
            x++;
            y++;

        }
        System.out.println(x);
        // System.out.println(y);//Illegal
    }
}
