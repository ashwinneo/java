import java.util.Arrays;

class FirstNonRepeatingString{


    static void firstNonRepeatChar(String s) {
        int[] count = new int[256];

        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i)]++;
        }
        //System.out.println(Arrays.toString(count));

        for(int i=0; i<count.length;i++) {
            if(count[i] == 1) {
                System.out.printf("%c",i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String s  = "CCCCOOOODNDDDMmMMd";
        FirstNonRepeatingString.firstNonRepeatChar(s);
    }
}