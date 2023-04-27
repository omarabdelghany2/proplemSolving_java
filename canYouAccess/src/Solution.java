import com.sun.source.tree.BinaryTree;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;


public class Solution {

	public static void main(String[] args) throws Exception {
		//DoNotTerminate.forbidExit();


			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

			//Write your code here
		BinaryTree







	}//end of main
	static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}

		public String displayPowerOf2(int num){
			Private inner =new Private();
			return (inner.powerof2(num));
		}
	}//end of Inner

}//end of Solution

