public class convertToChar_12 {
    public static char convertToChar(int num) {
        char result;
        // TODO: 여기에 코드를 작성합니다.
        result = Character.forDigit(num , 10);
        //하단의 코드는 수정하지 말아야 합니다.
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToChar(9));
    }
}
