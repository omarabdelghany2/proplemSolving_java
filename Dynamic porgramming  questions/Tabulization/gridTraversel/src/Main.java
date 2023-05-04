// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(gridTraversel(1,1));
        System.out.println(gridTraversel(2,3));
        System.out.println(gridTraversel(3,3));
    }
    public static int gridTraversel (int m,int n){
        int [][]grid=new int[m+1][n+1];

        grid[0][0]=1;
        for(int i=0;i<m;i++){

            for (int j=0;j<n;j++){
                grid[i][j+1]+=grid[i][j];
                grid[i+1][j]+=grid[i][j];
            }
        }

        return grid[m-1][n-1];
    }
}