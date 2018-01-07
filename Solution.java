import java.util.*;
public class Solution{
	private int lowLength, maxLength;

	public String  palindromeCheck(String s){

		if(s.length()< 2){
			return s;
		}

		

		for(int i = 0; i <s.length(); i++){
			findPalindrome(s, i-1, i+1);
			findPalindrome(s, i, i + 1);
		}


		return s.substring(lowLength, maxLength + lowLength);


	}

	public void findPalindrome(String s, int low, int high){
		while(low >=0 && high <= s.length()-1 && s.charAt(low) == s.charAt(high)){
			low--;
			high++;
		}

		if(maxLength < high - low - 1){
			lowLength += 1;
			maxLength = high - low - 1;
		}

	}

	public static void main(String[] args){
		Solution obj1 = new Solution();
		String s = obj1.palindromeCheck("");
		System.out.println(s);
	}
}