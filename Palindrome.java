class Palindrome{

    static boolean checkPalindrome(String s) {
        String s2 = "";
        char[] c = s.toCharArray();
        for(int i=c.length-1; i>=0;i--){
            s2 += c[i];
        }
        System.out.println(s2);
        if(s.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "malayalam";

        if(checkPalindrome(s)) {
            System.out.println(s + " is a palindrome");
        }
        else {
            System.out.printf(s + " is not a palindrome");
        }
    }
}