public class factorial_03 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int num) {
        int result = 1;
        //TODO : n! 값을 리턴
        for (int i = 1; i <= num; i++)  result *= i;

        return result;
    }

}
