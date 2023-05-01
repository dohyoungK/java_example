import java.util.ArrayList;
import java.util.Arrays;

public class AddLast_04 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a", "b"));
        System.out.println(addLast(arrayList, "c"));
    }

    public static ArrayList<String> addLast(ArrayList<String> arrayList, String str) {
        //TODO.. ArrayList와 문자열을 입력받아
        // ArrayList의 마지막에 문자열 추가하고 ArrayList 리턴

        arrayList.add(str);
        return arrayList;
    }
}
