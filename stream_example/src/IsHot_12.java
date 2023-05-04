import java.util.Arrays;

public class IsHot_12 {
    public static void main(String[] args) {

        int[] temperature = {25, 29, 30, 31, 36, 30};
        int[] emptyArr = {};
        System.out.println(isHot(temperature));
        System.out.println(isHot(emptyArr));
    }

    public static boolean isHot(int[] temperature) {
        //TODO.. 이번주 최고 온도가 담긴 배열에서
        // 30도를 넘은 날이 3일 이상이면 true,
        // 아니면 false 리턴

        if (temperature.length != 7) return false;
        if (Arrays.stream(temperature).filter(element -> element >= 30).count() >= 3) return true;
        else return false;
    }
}
