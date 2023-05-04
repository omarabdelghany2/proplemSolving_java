import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap myMap=new HashMap<String, Boolean>();
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",new String[]{"ef","eef","eee","eeee","eeeee","eeeeee"},myMap));
    }

    public static boolean canConstruct(String target,String[]wordBank,HashMap<String,Boolean> memo){

        if(memo.containsKey(target))
            return (boolean) memo.get(target);
        if(target.isEmpty()==true)
            return true;

        for (String word:wordBank ){

            if(target.indexOf(word)==0)
            {
                String suffix=target.substring(word.length());
                if(canConstruct(suffix,wordBank,memo)==true){

                    memo.put(target,true);
                    return true;
                }

            }

        }

        memo.put(target,false);
        return false;

    }
}