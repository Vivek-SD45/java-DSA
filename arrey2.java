


public class arrey2 {
    /**
     * @param number
     * @return
     */
    public static int getLargest_num(int number[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }

        }
        System.out.println("your smallest number is");
        System.out.println(smallest);

        
        return largest;
        
    }
    public static void main(String args[]){
        int number[]={1,2,6,3,5};
        System.out.println("your largest number is");
        System.out.println(getLargest_num(number));


    }
    
}
