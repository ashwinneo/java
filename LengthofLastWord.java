import java.util.Arrays;

class LengthofLastWord {
    
    public static int lengthLastWord(String s, String mode) {
        int len = 1;
        if(mode.equals("split")){
            String[] s1 = s.split(" ");
            System.out.println(Arrays.toString(s1));
            len = s1[s1.length-1].length();
        } else {
            for(int i=0; i<s.length();i++) {
                if(s.charAt(i) == ' ') {
                    len = 0;
                }
                else {
                    len++;
                }
            }
        }
        return len;
    }

    public static String largestWord(String s, String mode) {
        int max = 0;
        int largeString = 0;
        String largestString = "";
        if(mode.equals("split")) {
            String[] s1 = s.split(" ");
            for(int i=0; i<s1.length; i++) {
                
                largeString = s1[i].length();
                if(max < largeString) {
                    max = largeString;
                    largestString = s1[i];
                }
            }
        } else {
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i) == ' '){
                    largeString =0;
                } else {
                    largeString++;
                    System.out.println(largeString);
                    if(max < largeString) {
                        max = largeString;
                    }
                }
            }
        }
       
        return largestString;
    }

    public static void main(String[] args) {

        String s = "It is a bright1234445 day in California123";
        int n = LengthofLastWord.lengthLastWord(s,"split1");
        System.out.println(n);

        String output = LengthofLastWord.largestWord(s,"split");
        System.out.println(output);

    }
}