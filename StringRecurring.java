import java.util.Arrays;

class StringRecurring{

    static int[] count(String s){
        int[] count = new int[256];

        for(int i=0; i<s.length(); i++) {
           
                count[s.charAt(i)]++;
           
        }
        for (int i = 0; i < count.length; i++) {
		if(count[i] > 1) {
			System.out.printf("%c, count = %d \n", i, count[i]); 
	
          }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "ashwinashwin";
        int[] n = StringRecurring.count(s);
        System.out.println(Arrays.toString(n));
    }
}