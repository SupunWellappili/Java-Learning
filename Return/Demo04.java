package Return;
public class Demo04 {

    public static int  getting(int x ,int y){
        int tot = x+y;
        if (tot>0){
            return tot;
        }
        return -1;
    }
    public static void main(String[] args) {
       /* int xx =getting(12,4);
        System.out.println(xx);*/

        System.out.println(getting(12, 4));

    }
}

