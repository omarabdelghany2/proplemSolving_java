public class Main {


    public static void main(String[] args) {

        int result =climbStairs(3);
        System.out.println(result);

    }
    public static  int climbStairs (int n){


        int fib []=new int[n+2];
        fib[0]=0;
        fib[1]=1;
        fib[2]=2;

        for(int i=3;i<=n;i++){

            fib[i]=fib[i-1]+fib[i-2];
        }

        return fib[n];
    }


}