import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList_10 {
    public static void main(String[] args) {

        String[] arr = {"백엔드", "개발자", "김코딩"};
        String[] emptyArr = {};
        System.out.println(arrayToArrayList(arr));
        System.out.println(arrayToArrayList(emptyArr));
    }

    public static List<String> arrayToArrayList(String[] arr) {
        //TODO.. 배열을 ArrayList로 변환해 리턴
        if (arr.length == 0) return null;

        return new ArrayList<>(Arrays.asList(arr));
    }
}
