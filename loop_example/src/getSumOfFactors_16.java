public class getSumOfFactors_16 {
    public static void main(String[] args) {
        System.out.println(getSumOfFactors(8));
    }

    public static int getSumOfFactors(int num) {
        // TODO: 약수의 합 리턴
        int result = 0;

        for (int i = 1; i <= num; i++) {
            //num가 i로 나눠떨어지면 약수
            if (num % i == 0) result += i;
        }

        return result;
    }
}
