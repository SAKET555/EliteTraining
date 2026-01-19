class Valid_Palindrome_Brute_Force_Approach_Leetcodeeasy {
    public boolean isPalindrome(String s) {
        String result = "";
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)) || Character.isWhitespace(s.charAt(i)))
            {
                continue;
            }
            result += s.charAt(i);
        }
        result = result.toLowerCase();
        String reverse =new StringBuilder(result).reverse().toString();
        if(reverse.equals(result))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}