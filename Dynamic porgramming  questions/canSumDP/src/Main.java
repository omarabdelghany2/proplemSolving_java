import javax.swing.plaf.PanelUI;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map <Integer, Boolean>memo =new HashMap<Integer, Boolean>();
        boolean flag=canSum(300,new int[]{7,14}, (HashMap) memo);
        System.out.println(flag);
    }
    public static boolean canSum(int targetSum,int [] numbers,HashMap memo){

        if(memo.containsKey(targetSum))
            return (boolean) memo.get(targetSum);
        if(targetSum<0)
            return false;
        if (targetSum==0)
            return true;

        for(int num:numbers){
            int reminder=targetSum-num;
           if(canSum(reminder,numbers,memo)==true) {

            memo.put(targetSum,true);
               return true;
           }
        }
        memo.put(targetSum,false);
        return false;
    }
}