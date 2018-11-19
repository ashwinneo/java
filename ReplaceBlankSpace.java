class ReplaceBlankSpace{

    static String replaceCharacters(String s) {
        String s1 = "";

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ') {
                s1 += "%20";
            }
            else {
                s1 += s.charAt(i);
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        String s = replaceCharacters("ashwin works for google");
        System.out.println(s);
    }
}