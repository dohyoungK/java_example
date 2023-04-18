public class or_15 {
    public static void main(String[] args) {
        System.out.println(or(true, false));
        System.out.println(or(false, false));
    }

    public static boolean or(boolean expression1, boolean expression2) {
        // TODO: 두 개 boolean을 or 연산한 것처럼 리턴
        // or 연산
        // t t = t, t f = t, f t = t, f f = f
        boolean result;

        if (!expression1 && !expression2){
            result = false;
        } else {
            result = true;
        }

        return result;
    }
}
