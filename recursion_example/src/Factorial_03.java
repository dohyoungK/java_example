public class Factorial_03 {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int num){
        //TODO.. 1부터 num까지의 곱

        if (num == 0) return 1;

        return num * factorial(num - 1);
    }
}
