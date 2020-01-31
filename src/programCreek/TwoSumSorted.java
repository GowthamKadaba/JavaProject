package programCreek;

public class TwoSumSorted {


    public static void TwoSortedSum (int[] inputArray, int target){
        if (inputArray == null || inputArray.length < 2){
            System.out.println(" Input array in invalid ");
        }

        int i = 0;
        int j = inputArray.length -1;

        while (i<j){
            int x = inputArray[i] + inputArray[j];
            if (x < target){
                ++i;
            }else if (x > target){
                j--;
            }else{
                System.out.println( " Output " + inputArray[i] + " : " + inputArray[j]);
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] in = new int[] {1,2,5,9};
        int target = 6;

        TwoSortedSum(in, target);

    }
}
