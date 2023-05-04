import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String in="asda";
        in=in.substring(1);
        System.out.println("Hello world!");
        HashMap <Integer,ArrayList>myMap=new HashMap<Integer,ArrayList>();
        System.out.println(bestSum(100,new int[]{25,1,2,3},myMap));
    }



    public static ArrayList<Integer> bestSum(int targetSum,int [] numbers,HashMap <Integer,ArrayList>memo){


        if(memo.containsKey(targetSum))
            return memo.get(targetSum);

        if(targetSum==0)
            return new ArrayList<Integer>();
        if (targetSum<0)
            return null;
        ArrayList<Integer>shortestCombination=null;
        for(int num:numbers){

            int reminder=targetSum-num;

            ArrayList<Integer>reminderList=bestSum(reminder,numbers,memo);
            if(reminderList!=null) {
                reminderList.add(num);


                if (shortestCombination == null || reminderList.size() < shortestCombination.size()) {
                    shortestCombination = reminderList;
                }

            }


        }
        memo.put(targetSum,shortestCombination);

        return memo.get(targetSum);
    }


}