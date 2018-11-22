import java.util.Arrays;

class HouseStore {

    public static int[] shortDist(int[] houses, int[] stores) {
         int m = stores.length;
         int n = houses.length;
         int[] result = new int[houses.length];
         int diff = 0;
         for(int i=0; i<n; i++) {
             for(int j=0; j<m; j++) {
                diff = Math.abs(houses[i] - stores[j]);

                if(diff < houses[i]) {
                    result[i] = stores[j];
                }
             }
         }
         return result;
    }

    public static void main(String[] args) {
        int[] houses = {5, 10, 17};
        int[] stores = {1, 5, 20, 11, 16};

        int[] result = shortDist(houses, stores);
        System.out.println(Arrays.toString(result));
    } 
}