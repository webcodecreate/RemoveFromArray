package removefromarray;

import java.util.Arrays;

public class RemoveFromArray {
    
    private static int [] arr = {1, 2, 3, 4, 6, 7, 4, 4, 3, 2, 1, 5, 7, 8, 7, 4, 3, 6, 1, 2};
    private static int [] finalArr;
    
    public static int[] removeFromArray (int [] arr, int index) {
        int finalArrIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index != arr[i]) {
                finalArrIndex++;
            }
        }
        finalArr = new int [finalArrIndex];
        int shift = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (index == arr[i]) {
                shift++;
            } else {
                finalArr[i - shift] = arr[i];
            }
        }
        return finalArr;
    }
    
    public static void main(String[] args) {
        RemoveFromArray rfa = new RemoveFromArray();
        System.out.printf("%s ", Arrays.toString(arr));
        System.out.println("");
        rfa.removeFromArray(arr, 4);
        System.out.printf("%s ", Arrays.toString(finalArr));
        
    }
    
}
