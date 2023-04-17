public class convertToNumber_11 {
    public static int convertToNumber(char character) {
        int result;
        // TODO: 여기에 코드를 작성합니다.
        result = Character.getNumericValue(character);
        //하단의 코드는 수정하지 말아야 합니다.
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToNumber('9'));
    }
}
