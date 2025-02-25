public class Recursy {

    static void hello(){
        hello();
    }


    static long ops;

    /**
     *
     * Recursice loop
     * @param i
     * @param max
     */
    static void loop(int i,int max){

        if(i>max) return;
        System.out.println(i+" ");
        loop(i+1,max);
    }

    static void countdown (int n){
        if(n<0) return;
    System.out.println(n+" ");
    countdown(n-1);
}

    public static int pow(int n, int y) {
        if (y != 0)  return (n*pow (n,y-1));
         else return 1;

    }
    /**
     * fibonacci
     *
     *
      */

    static int fib(long n){
      ops++;

     if (n<=1) return (int) n;
     return fib(n-1)+fib(n-2);
    }

    static long [] fibCache= new long[1000];
    static long fastFib(long n){
        ops++;
        if (n<=1) return n;
        //om värdet redan finns uträknat, returnera det, skriv in värdet i cahce.
        if (fibCache[(int) n] !=0) return fibCache[(int) n];
       long ret=  fastFib(n-1)+fastFib(n-2);
       fibCache[(int) n]=ret;
       return ret;
    }

}
