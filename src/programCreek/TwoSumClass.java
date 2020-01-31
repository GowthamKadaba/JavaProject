package programCreek;

import java.util.HashMap;

public class TwoSumClass {

    private HashMap<Integer,Integer> tcMap = new HashMap<Integer,Integer>();

    public void addElement(int number){
        if (tcMap.containsKey(number)){
            tcMap.put(number, tcMap.get(number) + 1);
        }else{
            tcMap.put(number, 1);
        }
    }

    public boolean find(int target){
        for (Integer i : tcMap.keySet()){
            int value = target - i;
            if (tcMap.containsKey(value)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
