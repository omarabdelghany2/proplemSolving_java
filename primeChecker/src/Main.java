import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int [] array=new int[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            array[i]=input.nextInt();
        }

        for(int i=0;i<5;i++){
            if(!checkPrime(array[i]))
                array[i]=0;
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            if(array[i]!=0)
                list.add(array[i]);
            System.out.println(list);
        }

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
    public static boolean checkPrime(int n) {
        boolean flag = true;
        if (n == 0 || n == 1)
            flag = false;
        int i;
        for (i = 2; i <= n / 2; ++i) {

            // if n is divisible by i, then n is not prime
            // change flag to 1 for non-prime number
            if (n % i == 0) {
                flag = false;
                break;
            }


        }
        return flag;
    }
    }