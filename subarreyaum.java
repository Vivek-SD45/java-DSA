

public class subarreyaum {
    public static void subarr(int number[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currsum=0;
                for (int k = start; k <= end; k++) {
                    currsum += number[k];
                    // subsrrey

                }
                System.out.println(currsum);
                if (maxSum < currsum) {
                    maxSum = currsum;
                }

               
               

            }
   
            

        }
        
        System.out.println("maxsum=" + maxSum);
    }

    public static void main(String args[]) {
        int number[] = { 1, -2, 6, -1, 3 };
        subarr(number);
    }
}
