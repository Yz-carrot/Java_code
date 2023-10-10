package al_homework;

import java.util.Scanner;

public class checkPalindromes {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        String given = scanner.nextLine();
        System.out.println(isPalindrome(given));
    }
    private static boolean isPalindrome(String given){
        String rightStr=rightString(given);
        return isPalindrome1(rightStr,0,rightStr.length()-1);
    }
    private static String rightString(String given){
        String rightStr=given.toLowerCase().replaceAll("[^a-z]","");
        return rightStr;
    }
    private static boolean isPalindrome1(String s,int start,int end){
        if(start>=end) return true;
        else{
            char c_start=s.charAt(start);
            char c_end=s.charAt(end);
            if(c_start==c_end) return isPalindrome1(s,start+1,end-1);
            else return false;
        }
    }
}


