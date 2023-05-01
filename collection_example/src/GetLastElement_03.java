import java.util.ArrayList;
import java.util.Arrays;

public class GetLastElement_03 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("코", "드", "스", "테", "이", "츠"));
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println(getLastElement(arrayList));
        System.out.println(getLastElement(emptyList));
    }

    public static String getLastElement(ArrayList<String> arrayList) {
        //TODO.. String 타입의 ArrayList를 입력받아 마지막 요소 리턴

        if (arrayList.isEmpty()) return null;
        return arrayList.get(arrayList.size() - 1);
    }
}
