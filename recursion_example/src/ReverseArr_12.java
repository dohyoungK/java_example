import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseArr_12 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArr(new int[]{6,2,1,3,5,2})));
    }

    public static int[] reverseArr(int[] arr){
        // TODO:

        if (arr.length == 0) return arr;

        int[] head = Arrays.copyOfRange(arr, arr.length - 1, arr.length);
        int[] tail = Arrays.copyOfRange(arr, 0, arr.length - 1);
        tail = reverseArr(tail);

        int[] result = IntStream.concat(Arrays.stream(head), Arrays.stream(tail)).toArray();

        return result;
    }
}
