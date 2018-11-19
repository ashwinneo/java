class FindSubString{

    static void findSubString(String s, String is) {
        if(s.indexOf(is) > 0) {
            System.out.println("Present " + s.indexOf(is));
        } else {
            System.out.println("NotPresent");
        }
    }
    
    static int isSubstring(String s1, String s2) 
    { 
        int M = s1.length(); 
        int N = s2.length(); 
      
        /* A loop to slide pat[] one by one */
        for(int i=0; i<= N-M; i++){
            int j;
            for(j=0;j<M;j++) {
                if(s2.charAt(i+j) != s1.charAt(j)) {
                    break;
                }
                
            }
            if(j == M) {
                return i;
            }
        }
        return -1; 
    } 
    public static void main(String[] args){
       int n = isSubstring("is","ashwinis");
       System.out.println(n);
    }
}