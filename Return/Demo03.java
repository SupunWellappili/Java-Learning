package Return;
public class Demo03 {
        public static int getting(int a, int b) {
            int tot;
            tot = a + b;
            if (tot > 0) {
               // return tot;    //miss return(warahan athule thiyena nisaa)
            }return tot;
        }

        public static void main(String args[]) {
            getting(12, 3);
        }
    }
