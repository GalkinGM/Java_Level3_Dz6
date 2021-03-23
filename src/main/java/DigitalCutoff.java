import java.util.ArrayList;
import java.util.stream.IntStream;

public class DigitalCutoff implements Digital {

    @Override
    public int[] digitalCutoff (int [] arr, int x) {

        ArrayList <Integer>list = new ArrayList();
        for (int i = arr.length-1; i > 1 ; i--) {
            if(arr[i]==4){
                Integer [] arr1 = list.toArray(new Integer[list.size()]);
                int[] arr2 = IntStream.range(0, arr1.length)
                        .map(j -> arr1[arr1.length - 1 - j])
                        .toArray();
                return arr2;
            }
            list.add(arr[i]);
        }
        throw new RuntimeException("В массиве не числа" + x);
    }
}
