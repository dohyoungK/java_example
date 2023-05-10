import java.util.*;

public class SumTo_01 {
    public static void main(String[] args) {

        System.out.println(sumTo(4));
    }

    public static int sumTo(int num) {
        //TODO.. 1부터 입력된 수까지의 합 리턴
        // num -> 0

        if (num == 0) return 0;

        return num + sumTo(num - 1);
    }
}