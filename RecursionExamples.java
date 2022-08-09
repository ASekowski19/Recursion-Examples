package prob1;

import java.util.Arrays;
import java.util.Collections;

public class RecursionExamples {

	// Problem 1a
	public static double sumSeries(int n) {
		 if (n == 0) {
	            return 1;
	        }
	        else if ((n % 2) == 0){
	            return -(1.0/n) + sumSeries(n-1);
	        }
	        else {
	            return (1.0/n) + sumSeries(n-1);
	        }
	    }

	private static double m(int i) {
		if(i<=1) {  // base case
			return 1;
		}
		return m(i-1) + 1.0/i;	// recursive step
	}

	// Problem 1b
	public static void printReverse2(String s) {
		if(s.length()<=1) { // base case
			System.out.print(s);
			}
			else {
			System.out.print(s.charAt(s.length()-1));
			printReverse2(s.substring(0,s.length()-1)); 
			System.out.println("");
			}
	}
	
	// Problem 1c
	public static void printReverse(String s, int n) {
		if(n<=0) { // base case
			return;
			}
			System.out.print(s.charAt(s.length()-1));
			printReverse2(s.substring(0,s.length()-1)); 
			System.out.println("");
			}
		

	

	// Problem 1d
	public static int countVowels(String s) {
		int vowels = 0;
	    s=s.toLowerCase();
	    for(char c : s.toCharArray()) {
	        if("euioa".contains(c+""))vowels++;
	    }
	    return vowels;
	}
	

	// Problem 1e, requires a helper
	public static int countLength(String[] strs) {
			 Arrays.sort(strs);
			 return strs[0].length();
	    }

	

	// Problem 1f, requires a helper
	public static int getMax(int[] vals) {
		
	    Integer max = Integer.MIN_VALUE;
	    for (Integer i: vals)
	    {
	        if (max < i) {
	            max = i;
	        }
	    }
	    return max;
	}
	// Problem 1g, requires a helper
	public static int countCode(String msg, String code ) {
		return countCode(msg, code, 0);
	}
	//helper
	private static int countCode(String msg, String code, int pos ) {
		if(pos >= msg.length()-code.length()+1) {
			return 0;
		}
		else {
			if(msg.substring(pos,pos+code.length()).equals(code))
				return 1 + countCode(msg,code,pos+code.length());
			else
				return countCode(msg,code,pos+1);
		}
	}

}
