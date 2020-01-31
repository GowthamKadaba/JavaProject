package programCreek;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static int[] twoSum(int[] input, int target){
        Map<Integer,Integer> mp = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < input.length; i++) {
            if (mp.containsKey(input[i])){
                int index = mp.get(input[i]);
                result[0] = index;
                result[1] = i;
                System.out.println("Output index : " + index + " : " + i );
                break;
            }else{
                mp.put(target - input[i], i);
            }
        }

        return result;

    }


    public static void main(String[] args){

         twoSum( new int[]{2,7,9,11} , 9);

    }

}
