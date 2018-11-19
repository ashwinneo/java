import java.util.*;
class DoubleMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int m = sc.nextInt();
        System.out.println("Enter the row");
        int n = sc.nextInt();

        int[][] array = new int[m][n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.toString(array));

        sc.close();
    }
}