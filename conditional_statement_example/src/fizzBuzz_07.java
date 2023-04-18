public class fizzBuzz_07 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(2));
    }

    public static String fizzBuzz(int num) {
        // TODO: 3으로 나눠지면 fizz 리턴
        // TODO: 5으로 나눠지면 buzz 리턴
        // TODO: 3과 5로 모두 나눠지면 fizzbuzz 리턴
        // TODO: 3과 5로 모두 나눠지지 않으면 no fizzbuzz 출력
        String result;

        if (num % 3 == 0 && num % 5 == 0) {
            result = "FizzBuzz";
        } else if (num % 3 == 0) {
            result = "Fizz";
        } else if (num % 5 == 0) {
            result = "Buzz";
        } else {
            result = "No FizzBuzz";
        }

        return result;
    }
}
