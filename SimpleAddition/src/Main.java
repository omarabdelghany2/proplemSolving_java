import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static  StringBuffer output=new StringBuffer();
    static int Sum;
    public static void Add(Queue MyQueue){
        for(int i=1;i<6;i++) {
            if(i!=3){
            int x = (int) MyQueue.poll();
            output = output.append("+"+x);
            Sum += x;
            output = output.append("=");
            System.out.print(output);
            System.out.println(Sum);
            output = output.deleteCharAt(output.length() - 1);
        }
            else
                Sum+=(int)MyQueue.poll();
        }
    }
    public static void main(String[] args) {


        Queue<Integer>myQueue=new ArrayDeque<Integer>();
        Scanner input=new Scanner(System.in);
        int x;
        for (int i=0;i<6;i++){
            x=input.nextInt();
            myQueue.add(x);
        }
        int y=myQueue.poll();
        output = output.append(y);
        Sum+=y;

        Main.Add(myQueue);

    }
}