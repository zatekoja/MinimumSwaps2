public class Solution {
    static int minimumSwaps(int[] arr) {
        int swap = 0;
        int i = 0;
        while (i < arr.length) {
            int x = i + 1;
            //because array is ordered and from 1 .. N, if it is in right order, it should go from 1,2,3,..N
            if (arr[i] != x) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;

                swap++;
            } else i++;

        }
        return swap;
    }

    public static void main(String[] args) {

    }
}
