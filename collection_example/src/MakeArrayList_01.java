import java.util.ArrayList;

public class MakeArrayList_01 {
    public static void main(String[] args) {

        System.out.println(makeArrayList());
    }

    public static ArrayList<Integer> makeArrayList() {
        //TODO.. ArrayList에 1~5를 담아 리턴

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        return list;
    }
}