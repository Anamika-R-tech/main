package Leetcode1;

public class ques5 {
	public int climbStairs(int n) {
	    int result = count(n);
	        return result;
	    }
	    int count(int n){
	        if(n==1 || n == 2){
	            return n;
	        }
	    int count = climbStairs(n-1) + climbStairs(n-2);
	    return count;
	}
}
