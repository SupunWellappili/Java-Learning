# Java-Learning
Java


import java.util.Scanner;
class Demo{
public  static void main (String args[]){

	}
	public static  void getting(int x, y){
//parametar athule coma separatar use krnna baa nikan
int x,y,z;  //illegal
}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

class main {
public static void main(String args[]) {
int x=78,y=9;
main ob = new main();
ob.getting(x,y);
}

    public void getting(int p, int q) {
        int a;
        int b;
        int p; //illegal
        System.out.println(p+"  "+q);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
 
class main {
public static void main(String args[]) {
getting(10,20,30); //illegal
getting(10); //illegal
getting(10,20); //legal   same parametar same argument
}

    public static void getting(int x, int y) {
        System.out.println(x+" "+y);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
byte--->short-->int-->long-->floate-->Double
char--^
///////////////////////////////////////////////////////////////////////////////////////////////////////////

___________Return_____________


1)return; (Only "Void" type method )---optional
2)return date; (return type method)


///////////////////////////////////////////////////////////////////////////////////////////////////////////


+++++++++++++____One Step___+++++++++++++++

class Example {
public static int getting(int a, int b) {
int tot;
tot = a + b;
if (tot > 0) {
return tot;
}
return -1;
}

        public static void main (String args[]){
            getting(12, 3);
        }
    }

++++++++++++++____Two Step______++++++++++++++

class Example {
public static int getting(int a, int b) {
int tot;
tot = a + b;
if (tot > 0) {
return tot;
}else{
return -1;
}
}

        public static void main (String args[]){
            getting(12, 3);
        }
    }

++++++++++++++++++++______Error___+++++++++++++++++

class Example {
public static int getting(int a, int b) {
int tot;
tot = a + b;
if (tot > 0) {
return tot;
} else {
return 0;
}
return -1; //illegal
}

    public static void main(String args[]) {
        getting(12, 3);
    }
}
