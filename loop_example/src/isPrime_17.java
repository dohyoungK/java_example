public class isPrime_17 {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrime(6));
    }

    public static boolean isPrime(int num) {
        // TODO: 1은 제외하고
        // 2부터 num의 제곱근까지 나눠지는 수가 존재한다면 소수가 아니다.
        if (num == 1)   return false;
        if (num == 2)   return true;
        if (num % 2 == 0)   return false;
        for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
            if (num % i == 0)   return false;
        }

        return true;
    }
}
