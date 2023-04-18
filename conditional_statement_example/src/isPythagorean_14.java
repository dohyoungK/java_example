public class isPythagorean_14 {
    public static void main(String[] args) {
        System.out.println(isPythagorean(3, 4, 5));
        System.out.println(isPythagorean(3, 6, 5));
    }

    public static boolean isPythagorean(int side1, int side2, int side3) {
        // TODO: 세 변의 길이를 입력받아서 직각삼각형인지 확인
        // 가장 긴 변을 찾고 긴변의 제곱 = 나머지 제곱의 합 성립하는 지 확인
        boolean result;
        int pow1 = (int) Math.pow(side1, 2);
        int pow2 = (int) Math.pow(side2, 2);
        int pow3 = (int) Math.pow(side3, 2);

        if (pow1 == pow2 + pow3 || pow2 == pow1 + pow3 || pow3 == pow1 + pow2){
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
