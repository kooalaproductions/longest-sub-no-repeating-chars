class Solution {


    public static void lengthOfLongestSubstring(String s) {
        System.out.println(s);

        char[] charOfString = new char[s.length()];
        for(int i =0; i<s.length();i++){
            charOfString[i]=s.charAt(i);//passing each character of string to charOfString
        }
        //if matches next character then end of the substring
        //store char array letter by letter and compare to string s

    }

    public static void main(String args[]){
        lengthOfLongestSubstring("abcabcbb");
    }



}