public class sum_01 {
    public static void main(String[] args) {

        System.out.println(sumTo(3));
    }

    public static int sumTo(int num) {
        int result = 0;
        //TODO : 0부터 num까지의 합 리턴
        for(int i = 0; i < num + 1; i++){
            result += i;
        }

        return result;
    }
}