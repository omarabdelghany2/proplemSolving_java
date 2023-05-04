import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String ,Integer> grid =new HashMap<String ,Integer>();
        long result=gridTraveler(18,18 ,grid);
        System.out.println(result);
    }
    public static long gridTraveler(int i,int j,Map grid){
        String key =Integer.toString(i)+','+Integer.toString(j);

        if(grid.containsKey(key))
            return (long)grid.get(key);
        if (i==1&&j==1)
            return 1;
        if(i==0||j==0)
            return 0;
        grid.put (key,(gridTraveler(i-1,j,grid)+gridTraveler(i,j-1,grid)));
        return (long)grid.get(key);
    }
}