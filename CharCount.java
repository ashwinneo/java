class CharCount {

    static int countOfChar(String s, char c) {
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = countOfChar("ashwaain",'a');
        System.out.println(n);
    }
}