import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(Fib(8));
    }

    public static double Fib(int num){
        double []Table =new double[num+1];
        Table[0]=1;
        Table[1]=1;
        for(int i=2;i<=num;i++){
            Table[i]=Table[i-1]+Table[i-2];
        }
        return Table[num-1];
    }
}