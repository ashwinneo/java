class CountVowelsAndCons{

    static void count(String s) {
        int vcount = 0;
        int ccount = 0;
        // char[] vowels = {a,e,i,o,u};
        // for(int i=0;i<s.length()-1;i++) {
        //     if (s.charAt(i) == "a,e,i,o,u") {
        //         vcount++;
        //     }
        //     if (!s..charAt(i).contains("a,e,i,o,u")) {
        //         ccount++;
        //     }
        // }
        char[] word = s.toCharArray();
        
        for(char w : word) {
            switch(w) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                vcount++;
                break;
                default:
                break;
            }
        }
        System.out.println("Vovel Count " + vcount);
        System.out.println("Consanants Count " + (s.length()-vcount));
    }

    public static void main(String[] args) {
        String s1 = "ashwin";
        CountVowelsAndCons.count(s1);
    }
}