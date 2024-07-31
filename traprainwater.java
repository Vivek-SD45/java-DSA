public class traprainwater {

    public static int trapw(int hieght[]) {
        int n = hieght.length; // calculate left max buondry-arrey
        int[] leftmax = new int[n];
        leftmax[0] = hieght[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max((hieght[i]), leftmax[i - 1]);
        }

        // calculateb right max boundry-arrey
        int[] rightmax = new int[n];
        rightmax[hieght.length - 1] = hieght[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max((hieght[i]), rightmax[i + 1]);
        }
        int trapwater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // water level=min(left max bound,right max bound)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trapped waterwater level hight [i]
            trapwater += (waterlevel - hieght[i]);
        }
        return trapwater;

    }

    public static void main(String args[]) {
        int hieght[] = { 4, 2, 0, 6, 3, 10, 5 };
        System.out.println(trapw(hieght));
    }
}
