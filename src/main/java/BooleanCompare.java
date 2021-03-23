import java.util.Arrays;

public class BooleanCompare {

    public boolean blNumArr(int[] arr) {
        Arrays.sort(arr);
        for ( int c: arr) {
            if (1<c && c<4){return false;
            }
        }
        if (arr[0] == 1 && arr[arr.length-1] ==4) {
            return true;
        }
        return false;
    }
}

