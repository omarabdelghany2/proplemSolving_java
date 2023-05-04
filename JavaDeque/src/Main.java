import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet mySet=new HashSet<Integer>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max=-1;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            mySet.add(num);

            if(deque.size()==m){

                if(mySet.size()>max){
                  max=mySet.size();
                  int first =deque.remove();
                  if(!deque.contains(first))
                        mySet.remove(first);
                }


            }


        }
        System.out.println(max);






    }
}



