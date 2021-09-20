class Solution {


    public int lengthOfLongestSubstring(String s) {

        int stringLength =0;
        char[] stringToChar = new char[s.length()];
        char[] compareString = new char[s.length()];
        char[] subString = new char[s.length()];

        if(s == null || s.equals(" ")){//checks its string is empty
            return 0;
        }
        for(int i =0; i<s.length();i++){//passing the whole string to char array
            stringToChar[i] = s.charAt(i);
            compareString[i] = s.charAt(i);//will use this to compare each letter for substring
        }

            for(int start = 0; start < s.length(); start++){//compare the letters
                for(int next = start+1, incrementSub = 0; next < s.length(); next++, incrementSub++){
                    if(stringToChar[start] == compareString[next]){//check if there are duplicates
                        //if 'a' at start = 0 is equal to next =3
                        //then
                        //return size of subString
                        stringLength = next;
                        return stringLength;
                    }
                    else{
                        subString[incrementSub] = stringToChar[incrementSub];
                    }
                }
            }




        return stringLength;

    }



    public static void main(String args[]){
        Solution test = new Solution();
        System.out.println("Length of longest substring: " + test.lengthOfLongestSubstring("pwwkew"));
        //pwwkew does not work properly its suppose to return 3 but with my method it currently returns 2
    }



}