public class countingSo {
    /**
     * @param arr
     */
    public static void countingSort(int arr[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }

        int count[] = new int[largest + 1];
        // itration done on orginal arrey to count the frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            // number ko index ki trh lena h phir count m us number pr jana h aur us number
            // ko ke dena h ++

        }
        // sorting
        // itration done on count arrey
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 1, 5, 8, 5, 5};
        countingSort(arr);
        printarr(arr);
    }

}
