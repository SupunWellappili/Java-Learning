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

- [ ] return —> Anivaren void method wiya uthui, method akai return krnne..
- [ ] return data —> Data akai return kranne..
- [ ] return statement akak thibeda aniwaren return data akak thibiya uthumai…[public static int void printTotal(int a,int b)]
- [ ] return statement akak athule condition akak  thiyenawa nam aniwaren sema statment akakma cheak krai..



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

//////////////////////////////////////////////////////////////////////////////////////////////////

case 7
=======
class Example {
public static void main(String[] args) {

        int[] x =new int[3];
        int[] y = new int[9];
        for (int i = 0; i < 10; i++) {
            x[i] = i;
        }
        System.out.println();
         
	}
}

_________________________________________________________________________

class Example {
public static void main(String[] args) {

        int[] x =new int[3];
        int[] z = new int[100];

        z[0] = 100;
        z[-1] = 7687;//legal-->arrys wala index allanna amarui compileta runtime thamai cheak wenne.error godak atha lebe.thawama krmayak hoyagena netha.
        z[999999] = 65;//legal

    }

//////////////////////////////////////////////////////////////////////////////////////////////////


________Zero Elements (Zero Length Array)________

case 8
=======
class Example {
public static void main(String[] args) {

        int[] xr = new int[0];
        System.out.println(xr.length);//0

        int[] yr = {};
        System.out.println(yr.length);//0
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////

_____________Array Compatibility______________

case 9
=======
class Example {
public static void main(String[] args) {

        int[] xr = new int[3];
        double[] yr = new double[3];

//---------------Array Object-------------------------------
xr[0] = yr[0];//legal
yr[0] = xr[0];//illegal
xr[0] = (int) yr[0]; //legal-->cast

//---------------Array Reference-------------------------------
xr = yr;//illegal
yr = xr;//illegal
xr = (int[]) yr;//illegal
yr = (double[]) xr;//illegal
}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////

case 10
=======
class Example {
public static void main(String[] args) {

        int[] xr = new double[3];//illegal
        double[] yr = new int[3];//illegal
    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////

case 11
=======
//Arrays 1kaka index 1ka long variable 1kakin ganna baa..

class Example {
public static void main(String[] args) {

        long n = 100;
        long[] xr = new long[3];//Illegal 
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////


______for-each loops/en-hand for loops(since JDK1.5)_____

//meya use krnne Arrays and collecting class walata pamini



pcase01
=======

import java.sql.SQLOutput;

class Example {
public static void main(String[] args) {

        int[] ar = {45, 76, 34, 12, 98, 78, 99, 5};
        System.out.println(Arrays.toString(ar));
        for (int a : ar) {//for-each loop-->Read only loop
            a++;
        }
        System.out.println(Arrays.toString(ar));//[45, 76, 34, 12, 98, 78, 99, 5]


        for (int i = 0; i < ar.length; i++) { //for loop-->modifer loop
            ar[i]++;
        }
        System.out.println(Arrays.toString(ar));//[46, 77, 35, 13, 99, 79, 100, 6]
    }
}

////////////////////////////////////////////////////////////////////
case02
=======

class Example {
public static void main(String[] args) {

        int[] ar = {45, 76, 34, 12, 98, 78, 99, 5};
        System.out.println(Arrays.toString(ar));
        for (byte a : ar) {    //illegal(naror casting)
            a++;
        }
        System.out.println(Arrays.toString(ar));

///////////////////////////////////////////////////////////////////////
case03
=======

class Example {
public static void main(String[] args) {

        int[] ar = {45, 76, 34, 12, 98, 78, 99, 5};
        System.out.println(Arrays.toString(ar));
	int a;    //illegal(Kalin inititation krnna ba)
        for ( a : ar) {    //illegal(naror casting)
            a++;
        }
        System.out.println(Arrays.toString(ar));
////////////////////////////////////////////////////////////////////////////////////////////

Excersices
==========
import java.util.Arrays;

class Example {
public static void main(String[] args) {
int[] ar = {90, 10, 80, 20, 70, 30, 60, 40, 50, 0};
System.out.println(Arrays.toString(ar));//[90, 10, 80, 20, 70, 30, 60, 40, 50, 0]
reverse(ar);
System.out.println(Arrays.toString(ar));//[0,50,40,60,30,70,20,80,10,90]
}
}

++++++++++++++++++++++++++++++++++++++++++++++++++++++

Result (Not complete)
=================


import java.util.Arrays;

class Example {
public static void reverse(int[] a) {
for (int i = a.length - 1; i<=0; i--) {
a[i];
}
}




    public static void main(String[] args) {
        int[] ar = {90, 10, 80, 20, 70, 30, 60, 40, 50, 0};
        System.out.println(Arrays.toString(ar));//[90, 10, 80, 20, 70, 30, 60, 40, 50, 0]
        reverse(ar);
        System.out.println(Arrays.toString(ar));//[0,50,40,60,30,70,20,80,10,90]
    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////
Excersices
==========
import java.sql.SQLOutput;

class Example {
public static void main(String[] args) {
int[] ar = {1, 2, 3, 4, 5, 2};
int[] br = {2, 5, 4, 3, 2, 1};
int[] cr = {2, 4, 5, 2, 1, 3};
int[] dr = {2, 4, 99, 1, 3,2};
int[] er = {2, 4, 5, 1, 3, 6};
int[] fr = {2, 5, 1, 3};

        System.out.println("ar equals to br : " + equals(ar, br));//true
        System.out.println("ar equals to cr : " + equals(ar, cr));//true
        System.out.println("ar equals to dr : " + equals(ar, dr));//false
        System.out.println("ar equals to er : " + equals(ar, er));//false
        System.out.println("ar equals to fr : " + equals(ar, fr));//false
    }
}

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Result (Not complete)
=======


///////////////////////////////////////////////////////////////////////////////////////////////////
Excersices
==========
import java.util.Arrays;
import java.util.Scanner;

class Example {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Input an integer : ");
int num = input.nextInt();
System.out.println("Num :" + num);

        int[] ar = numberToArray(num);
        for (int a : ar) {
            System.out.println(a + " ");
        }

    }
}

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Result (Not complete) 1kramaya
=======

import java.util.Arrays;
import java.util.Scanner;

class Example {
public static int digitCount(int num) {
int count = 0;
do {
count++;
} while ((num /= 10) != 0);
return count;
}


    public static int[] numberToArray(int a) {
        int[] temp = new int[digitCount(number)];
        //
        //
        return temp;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num = input.nextInt();
        System.out.println("Num :" + num);

        int[] ar = numberToArray(num);
        for (int a : ar) {
            System.out.println(a + " ");
        }

    }
}
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
2 weni kramaya  element add kra kra yana aka(ss atha)


/////////////////////////////////////////////////////////////////////////////////////////////////
Excersices
==========
import java.util.Arrays;

class Example {
public static int digitCount(int num) {
int[] ar = {1, 2, 3, 4, 5};
int[] br = {10, 20, 30, 40, 50, 60, 70};

        int[] cr = marge(ar, br);
        System.out.println(Arrays.toString(cr));//[1,2,3,4,5,10,20,30,40,50,60,70]
    }
}

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Result (Not complete)
=======
import java.util.Arrays;

class Example {
public static int[] marge(int[] a, int[] b) {
int[] x = new int[a.length + b.length];
//1 copy values from a to x
//2 copy values from b to x
}


    public static int digitCount(int num) {
        int[] ar = {1, 2, 3, 4, 5};
        int[] br = {10, 20, 30, 40, 50, 60, 70};

        int[] cr = marge(ar, br);
        System.out.println(Arrays.toString(cr));//[1,2,3,4,5,10,20,30,40,50,60,70]
    }
}


**_______________Array Sorting________________**
1. Bubble Sort
2. Selection Sort
3. Insertition Sort
4. Quick Sort
5. Heap Sort
6. Marge Sort




**____________Multi-Dimensional Arrays_____________**

1. one dimensional arrays
2. two dimensional arrays(2D arrays)


int[][] marks = new int[10][4];
[10]-->No of Arrays/No of RowsNo of Student
[4]-->No of Element per each Arrays/No Of ColoumsNo of Subject
//element 4 k thiyena 10ka unit 1kak
marks[10][4]-->marks 10arry 1ke 4weni element 1ka
marks[i][j]-->marks i weni array 1ke j weni element 1ka/marks i row 1ke j column 1ka


/////////////////////////////////////////////////////////////////////////////////////////////////

class Demo{
public static void main (String args[]){
int x;
System.out.println(x);
**_// array inisilization krnna awashya netha aya automatically siduwe jvm 1ka harha default thatha**_

		int [] xr = new int[3];
		System.out.println(xr[0]+" "+xr[1]+" "+xr[2]);
	}
}


//////////////////////////////////////////////////////////

package Multi_Dimensional_Arrays;

public class Demo04 {
public static void main(String[] args) {


        int[] ir = new int[3];
        double[] dr = new double[2];

        ir[0] = dr[0]; //illegal
        dr[0] = ir[0];
        ir[0] = (int) dr[0];
        //all illegal(array object 1kak kisima welawaka asign krnna ba)
        ir = dr;
        dr = ir;
        ir = (int[]) dr;
        dr = (int[]) ir;
    }
}


//////////////////////////////////////////////////////////

public static void printToal(int xr)  //para metar variable
public static void printTotal(int[] xr)  //Array reference variable
public static void printTotal(int… xr)  //Array Argument variable //Array references nethuwa unath refer krnna puluwan
