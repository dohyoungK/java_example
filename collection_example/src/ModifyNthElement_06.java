import java.util.ArrayList;
import java.util.Arrays;

public class ModifyNthElement_06 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("여러분", "화이팅", "입니다"));
        System.out.println(modifyNthElement(arrayList, 0, "여러분들"));
        System.out.println(modifyNthElement(arrayList, 3, "a"));
    }

    public static ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        //TODO.. ArrayList와 인덱스, 요소를 입력받아
        // 인덱스의 원래 값을 요소로 수정하고 ArrayList 리턴

        if (index >= arrayList.size()) return null;
        arrayList.set(index, str);
        return arrayList;
    }
}
