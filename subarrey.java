//countineous part of arrey



public class subarrey {
    public static void subarr(int number[]) {
        int ts =0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + ","); 
                    //subsrrey
                    
                }
                ts++;

                System.out.println();
              
                
                
            }
            System.out.println();

        }
System.out.println("total subarrey is"  +ts);

    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        subarr(number);
    }
}