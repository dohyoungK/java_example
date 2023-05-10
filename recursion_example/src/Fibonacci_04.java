public class Fibonacci_04 {
    public static void main(String[] args) {

        System.out.println(fibonacci(9));
    }

    public static int fibonacci(int num){
        //TODO.. num = 0 -> 0, num == 1 -> 1

        if (num == 0) return 0;
        if (num == 1) return 1;

        return fibonacci(num - 2) + fibonacci(num - 1);
    }
}
