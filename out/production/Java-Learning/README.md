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


//////////////////////////////////////////////////////////////////////////////////////////////////

class Example {
public static void findGrade(int a, int b) {
int tot;
tot = a + b;
System.out.println(tot);
return;
}

    public static int myMethod(int a, int b) {
        int tot;
        tot = a + b;
        return tot;
    }

    public static void main(String args[]) {
        int tot;
        tot = findGrade(10, 20); //illegal
        tot = myMethod(40, 50);

        System.out.println(findGrade(10, 20));//illegal
        System.out.println(myMethod(40, 50));
    }
}

//Void type method 1kak kisiwitaka value return krnne na awagema variable akakata asign krnaa ho  sop 1kak athule call krnna baa


//////////////////////////////Compile Ok?////////////////////////////////////

Question-:

class Example {
public static void main(String args[]) {
m();
}
}

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
class Example {
public static void m() {
}

    public static void main(String args[]) {
        m();
    }

}

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

class Example {
public static int m() {
return 100;
}

    public static void main(String args[]) {
        m();
    }
}

//////////////////////////////Compile Ok?////////////////////////////////////

Question-:

class Example {
public static void main(String args[]) {
int a;
a = m();
}
}
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Answer-:

class Example {
public static int m(int tot) {
return tot;
}

    public static void main(String args[]) {
        int a;
        int num=0;
        a = m(num);
    }
}

+++++++++++++++++++++++++++OR+++++++++++++++++++++++++++++++++++++++

class Example {
public static int m() {
return 100;
}

    public static void main(String args[]) {
        int a;
        a = m();
    }
}

///////////////////////////////Compile Ok?//////////////////////////

Quecton-:
class Example {
public static void main(String args[]) {
System.out.println(m());
}
}

+++++++++++++++++++++++++++++++++++++++++++++++++++

Answer-:
class Example {
public static int m() {
return 100;
}

    public static void main(String args[]) {
        System.out.println(m());
    }
}


______________Rules For Array Declaration___________

case 1
=====
class Example {
public static void main(String[] args) {
int x;
x = 100;
System.out.println(x);

        int[] xr;  //Create an array referance variable [type int]--> (Array Declaration)
        xr = new int[5]; //Create an array object (Array Constructor)
        System.out.println(xr); 
        
        xr[0] = 100; //Array Initialization 
        System.out.println(xr[0]);
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
case 2
=======
reference variable Create-->
int[] a;
int []a;
int a[];
int a[5];  //Illegal

Reference Variable walata size 1kak natha.but c++ waladi nam legal

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

case 3
=======
//Variable 1kak manual initialization krnna ona namuth array waldi array object auto initialization(Values) wela thiyenne

class Example {
public static void main(String[] args) {
boolean[] x = new boolean[2];
System.out.println(x[0] + ", " + x[1]); //default values--> false, false

        int[] y = new int[3];
        System.out.println(y[0] + ", " + y[1] + ", " + y[2]);//default values--> 0, 0, 0

        double[] z = new double[5];
        System.out.println(z[0] + ", " + z[1] + ", " + z[2] + ", " + z[3] + ", " + z[4]);
        //default values--> 0.0, 0.0, 0.0, 0.0, 0.0

        String a[] = new String[2];
        System.out.println(a[0] + " " + a[1]);//default values--> null, null

        char[] ch = new char[3];
        System.out.println(ch[0]+" "+ch[1]+" "+ch[2]);
        //Default Values→ASCII Code, ASCII Code (Char Character)
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

case 4
=======
class Example{
public static void main(String[] args) {

//-------------------------Method 01-------------------------------
int[] a = new int[5];
int[]b;
b= new int[4];
int[] c = new int[]; //illegal-->Size dila nethi nisa

//-------------------------Method 02-------------------------------
int[] d = {10,20,30};
int[] e;
e ={23,24,25}; //illegal-->kadala liyanna baa

//-------------------------Method 03-------------------------------
int[] f = new int[]{7,8,9,10};
int[] g;
g= new int[]{50,60,70}//illegal-->kadala liyanna baa

//-------------------------Method 04-------------------------------
int[] h =new int[3]{23,24,25,26};//illegal-->Size denna baa

    }
}


////////////////___________X.length________////////////////////

case 5
=======
class Example {
public static void main(String[] args) {

        int[] x = {23, 45, 33, 23, 2, 31, 45, 65, 22, 11};
        System.out.println("Length/Size : " + x.length);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ", ");
        }
        System.out.println("\b\b"+" = Size Count Is :"+x.length);
    }
}
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Result:-
Length/Size : 10
23, 45, 33, 23, 2, 31, 45, 65, 22, 11 = Size Count Is :10

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

______Runtime Error (ArrayIndexOutOfBoundsException)______

case 6
=======
class Example {
public static void main(String[] args) {

        int[] x =new int[3];

        System.out.println(x[0]);//0
        System.out.println(x[1]);//0
        System.out.println(x[2]);//0
        System.out.println(x[3]);
	}
}
