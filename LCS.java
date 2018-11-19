import java.util.Arrays;

class LCS {

    static void lcs(char[] a,char[] b) {
        int m = a.length;
        int n = b.length;
        int l[][] = new int[m+1][n+1];
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if(i == 0 || j == 0) {
                    l[i][j] = 0;
                }
                else if(a[i-1] == b[j-1]){
                    l[i][j] = 1 +l[i-1][j-1];
                }else {
                    l[i][j] = max(l[i-1][j] , l[i][j-1]);
                }
            }
        }
        System.out.println(l[m][n]);
    }
    
    static int max(int a, int b) {
        return (a > b) ? a:b;
    }
    
    public static void main(String[] args) {
        String a = "abcdeabd";
        String b = "abde";
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        lcs(c,d);

    }
}