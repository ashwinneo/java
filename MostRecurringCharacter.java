import java.util.Arrays;

class MostRecurringCharacter{

    static void mostRecChar(String s) {
        int[] count = new int[256];
        int max = 0;
        String sm = "";
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for(int i=0; i<count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                //sm = i;
                System.out.printf("%c & %d \n" , i,count[i]);
            }
        }
        //System.out.printf("%c" , sm);
        //System.out.println(Arrays.toString(count));
        //return sm;
    }
    
    public static void main(String[] args) {
        String s = "kkkknemalikant";
        mostRecChar(s);
        //System.out.println(n);
    }
}