import java.util.Arrays;

public class FindBiggestNumber_08 {
    public static void main(String[] args) {

        int[] arr = {1, 10, 5, 32, 5};
        int[] emptyArr = {};
        System.out.println(findBiggestNumber(arr));
        System.out.println(findBiggestNumber(emptyArr));
    }

    public static Integer findBiggestNumber(int[] arr) {
        //TODO.. 배열의 int 값 중 가장 큰 값 리턴

        if (arr.length == 0) return null;
        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }
}
