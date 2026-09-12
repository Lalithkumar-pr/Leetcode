import java.lang.String;
class Solution {
    public boolean isPalindrome(int x) {
        String y=String.valueOf(x);
        String z=new StringBuilder(y).reverse().toString();
        return y.equals(z);
    }
}