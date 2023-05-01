import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFromBackOfNew_09 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println(removeFromBackOfNew(arrayList));
        System.out.println(arrayList);
        System.out.println(removeFromBackOfNew(emptyList));
    }

    public static ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        //TODO.. ArrayList를 입력받아 마지막 요소가 제거된 새로운 ArrayList 리턴

        if(arrayList.isEmpty()) return null;

        ArrayList<Integer> result = new ArrayList<>(arrayList.subList(0, arrayList.size() - 1));
        return result;
    }
}
