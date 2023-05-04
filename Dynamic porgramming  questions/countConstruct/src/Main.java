import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap myMap=new HashMap<String, Boolean>();
        HashMap<String ,Integer> memo=new HashMap<String,Integer>();
        System.out.println(countConstruct("purple",new String[]{"purp","p","ur","le","purpl"},memo));
        System.out.println(countConstruct("abcdef",new String[]{"ab","abc","cd","def","abcd"},memo));
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",new String[]{"e","ee","eee","eeee","eeeee","eeeeee"},memo));
    }


    public static int countConstruct(String target,String[]wordBank,HashMap <String,Integer>memo){
        if(memo.containsKey(target))
            return memo.get(target);

        int totalCounts=0;
        if(target.isEmpty())
            return 1;

        for (String word:wordBank ){

            if(target.indexOf(word)==0)
            {
                String suffix=target.substring(word.length());
                int count =countConstruct(suffix,wordBank,memo);
                totalCounts+=count;
            }
        }
        memo.put(target,totalCounts);
        return totalCounts;
    }
}