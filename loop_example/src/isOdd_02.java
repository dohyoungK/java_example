public class isOdd_02 {
    public static void main(String[] args) {
        System.out.println(isOdd(100));
        System.out.println(isOdd(-8));
    }

    public static boolean isOdd(int num) {
        //조건문을 사용하여 짝수인 경우 return false를,
        //홀수인 경우 return true;를 작성해야 합니다.
        //TODO : if (num가 0일때) return false;
        // int count = 1;
        // while (count * 2 <= num) {count++}
        if (num == 0) return false;
        if (num < 0)  num *= -1;

        int count = 1;

        while (count * 2 <= num) { // count * 2 = 2,4,6,8,10
            if (count * 2 == num) return false;
            count++;
        }

        return true;
    }
}
