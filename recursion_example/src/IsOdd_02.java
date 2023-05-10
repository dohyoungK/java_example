public class IsOdd_02 {
    public static void main(String[] args) {

        System.out.println(isOdd(5));
        System.out.println(isOdd(4));
    }

    public static boolean isOdd(int num) {
        num = Math.abs(num);
        if (num == 0) return false;
        if (num == 1) return true;

        return isOdd(num - 2);
    }
}
