public class heapsort {

    public static void heapify(int arr[], int i, int size) {

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxId = i;
        if (left < size && arr[left] > arr[maxId]) {

            maxId = left;

        }
        if (right < size && arr[right] > arr[maxId]) {

            maxId = right;
        }
        if (maxId != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxId];
            arr[maxId] = temp;


            heapify(arr, maxId, size);

        }
    }

    public static void heapSort(int arr[]) {//O(nlogn)
        int n = arr.length;
        // last ;evel se sare upar vale node nikal liye phir unke liye heapify call kar
           // diya
        for (int i = n / 2; i >= 0; i--) {

            heapify(arr, i, n);   // call

        }
          // push largest at end ie;largest ko uthana h phir use end push krke remove kar
                  // dena h
        for (int i = n - 1; i > 0; i--) {
            // swap (largest ie; first with last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);//form max heap

        }

    }

    public static void main(String args[]) {
        int arr[]={1,2,4,5,3};
        heapSort(arr);
        //print
        for(int i=0; i<arr.length;i++){
System.out.print(arr[i]+ " ");

        }

    }

}
