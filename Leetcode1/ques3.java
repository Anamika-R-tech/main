package Leetcode1;

public class ques3 {
	public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        int st = 0;
        int end = s.length()-1;
        while(st <= end){
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }
            st++;
            end--;
            
        }
        return true;

    }
}
