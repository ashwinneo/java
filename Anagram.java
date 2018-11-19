import java.util.Arrays;

class Anagram {


    static void quickSort(char[] a, int n1, int n2) {
        if(n1 < n2) {
            int pi = partition(a, n1, n2);
            quickSort(a,n1,pi-1);
            quickSort(a,pi,n2);
        }
    }

    static int partition(char[] a, int n1, int n2) {
        int i = n1-1;
        char x = a[n2];
        for(int j=n1; j<n2; j++) {
            if(a[j] < x) {
                i++;
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        char temp = a[i+1];
        a[i+1] = a[n2];
        a[n2] = temp;

        return i+1;
    }

    
    static boolean checkAnagram(char[] s1, char[] s2, int n1, int n2) {
        if(n1 != n2) {
            System.out.println("String Lengths should match");
            return false;
        }

        quickSort(s1, 0, n1);
        quickSort(s2, 0, n2);

        for(int i=0; i<n1; i++) {
            if(s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "ashwi";
        char[] c1 = s1.toCharArray();
        System.out.println(Arrays.toString(c1));
        String s2 = "winash";
        char[] c2 = s1.toCharArray();
        int n1 = s1.length()-1;
        int n2 = s2.length()-1;

        if(checkAnagram(c1,c2,n1,n2)) {
            System.out.println("Are palindrome");
        } else {
            System.out.println("Are Not palindrome");
        }
                

    }
}