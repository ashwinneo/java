class RemoveCharacter {

    static String remove(String word, char ch) {
        String s2 = "";
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) != ch) {
                s2 += word.charAt(i);
            }
        }

        return s2;
    }

    public static void main(String[] args) {
        String s = "Ashwin";
        char c = 'A';
        String c1 = remove(s,c);
        System.out.println(c1);
    }
}