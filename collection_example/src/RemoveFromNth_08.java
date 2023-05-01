import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFromNth_08 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5"));
        System.out.println(removeFromNth(arrayList, 3));
        System.out.println(arrayList);
        System.out.println(removeFromNth(arrayList, 6));
    }

    public static String removeFromNth(ArrayList<String> arrayList, int index) {
        //TODO.. ArrayList와 인덱스를 입력받아
        // 해당 인덱스의 요소를 삭제한 후 해당 요소 리턴

        if (index >= arrayList.size()) return null;
        String result = arrayList.get(index);
        arrayList.remove(index);
        return result;
    }
}
