public class equalsTen_03 {
    public static void main(String[] args) {
        System.out.println(equalsTen(10));
        System.out.println(equalsTen(9));
    }

    public static boolean equalsTen(int num) {
        // TODO: 입력된 수가 10과 같은지 확인
        boolean result;

        if (num == 10) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
