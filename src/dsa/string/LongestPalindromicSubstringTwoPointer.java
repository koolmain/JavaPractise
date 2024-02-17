package dsa.string;

public class LongestPalindromicSubstringTwoPointer {


    String getLongestPalindromicString(String str){

        int n = str.length();
        int strLow = 0, strHigh=1;
        int low=-1,high=-1;
        for (int i = 1; i < n; i++) {
            low = i-1; high= i;
            //Below loop is to search for even length palindrome hence it is not have the same origin .
            while(low >=0 && high < n && str.charAt(low) == str.charAt(high)){

                if (high - low +1 > strHigh) {
                    strLow = low;
                    strHigh = high - low+1;
                }
                low--;
                high++;
            }

            //below is for odd length palindrome string and have the same origin as i
            low=i-1;
            high=i+1;
            while(low >= 0 && high < n && str.charAt(low) == str.charAt(high)){
                if (high - low +1 > strHigh) {
                    strLow = low;
                    strHigh = high - low+1;
                }
                low--;
                high++;

            }

        }
        return str.substring(strLow,strLow + strHigh );
    }

    public static void main(String[] args) {
        LongestPalindromicSubstringTwoPointer palString = new LongestPalindromicSubstringTwoPointer();
        System.out.println(palString.getLongestPalindromicString("forgeeksskeegfor”"));
    }
}
