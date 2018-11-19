class MaximumSubProblem {

    public static int maximumSum(int[] a) {
		int sum = 0;
		int n = a.length;
		int max = 0;
		for(int i=0;i<n;i++) {
			sum =0;
			for(int j=i;j<n;j++) {
				sum += a[j];
				if(max < sum) {
					max = sum;
				}
				
			}
		}
		
		return max;
	}
	

	static int kadanesAlgorithm(int[] a) {
		int sum =0;
		int maxSum = 0;

		for(int i=0; i<a.length; i++) {
			sum += a[i];

			if(sum < maxSum) {
				sum = 0;
			}

			else if(sum > maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}
    
    
       

    public static void main(String[] args) {    
		 //int[] a = {-2,-2,3,4,-5};
         //int max = MaximumSubProblem.maximumSum(a);
        //  int[] list = new int[10];
        //    for (int i=0; i<10; i++){
        //        int n = (int)(Math.random()*9 );
        //        list[i] = n;
       
        //        System.out.print(list[i] + " ");
		//    }
		int[] a = {-6,13,-14};
		int max = MaximumSubProblem.kadanesAlgorithm(a);
		System.out.println(max);
    }
}