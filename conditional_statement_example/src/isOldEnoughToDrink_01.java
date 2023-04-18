public class isOldEnoughToDrink_01 {
    public static void main(String[] args) {
        System.out.println(isOldEnoughToDrink(17));
        System.out.println(isOldEnoughToDrink(19));
    }

    public static boolean isOldEnoughToDrink(int age) {
        // TODO: 나이가 18세 이상인지 확인
        boolean result;

        if (age >= 18) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
