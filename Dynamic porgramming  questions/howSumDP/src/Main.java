import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList reminderResult=new ArrayList<Integer>();

        HashMap <Integer,ArrayList<Integer>> Mymap=new HashMap<>();

        System.out.println(howSum(7,(new int[]{2,3}),Mymap));
    }


    public static ArrayList<Integer> howSum(int targetSum, int []numbers, HashMap memo){

        if(memo.containsKey(targetSum))
            return (ArrayList<Integer>) memo.get(targetSum);
        if(targetSum==0)
            return  (new ArrayList<>());
        if(targetSum<0)
            return null;

        for (int num :numbers){

            int reminder =targetSum-num;

            ArrayList reminderResult=new ArrayList<Integer>();
            reminderResult=howSum(reminder,numbers,memo);
            if(reminderResult!=null){
                reminderResult.add(num);
                memo.put(targetSum,reminderResult);
                return (reminderResult);
            }

        }
        memo.put(targetSum,null);
        return null;

    }
}