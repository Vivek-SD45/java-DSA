public class prefixarreysum {
    public static void subarr(int number[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        //calculate prefix arrey
for(int i=1; i<prefix.length; i++){
    prefix[i]=prefix[i-1] + number[i];
}


        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currsum= start==0? prefix[end]  : prefix[end]-prefix[start-1];
                
                    // subsrrey

                }
                System.out.println(currsum);
                if (maxSum < currsum) {
                    maxSum = currsum;
                }

               
               

            }
   
            

        
        
        System.out.println("maxsum=" + maxSum);
    }    

    public static void main(String args[]) {
        int number[] = { 1, -2, 6, -1, 3 };
        subarr(number);
    }
    
}
