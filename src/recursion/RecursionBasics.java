package recursion;

public class RecursionBasics {


    public static void main(String[] args){
        printName(5);
    }

    //TODO: print Piyush 5 times using recursions

    public static void printName(int n){

        if(n ==0)return;

        printName(n-1);
        System.out.println("Piyush");

    }

    //TODO Problem 2: Print numbers from 1 to N using recursion.
    public static void printNumber(int n){
        if(n ==0)return;
        printNumber(n-1);
        System.out.println(n);
    }

   // TODO : Print numbers from N to 1 using recursion.

    public static void printNumberReverse(int n){
        if(n ==0)return;
        System.out.print(n);
        printNumberReverse(n-1);

    }

    // TODO Problem 4: Sum of First N Numbers

    public static int sumNumbers(int n){
        if(n ==0)return 0;
        return n+sumNumbers(n-1);
    }


}
