public class computeSumOfAllElements_04 {
    public static void main(String[] args) {
        System.out.println(computeSumOfAllElements(new int[]{1,2,3}));
        System.out.println(computeSumOfAllElements(new int[]{}));
    }

    public static int computeSumOfAllElements(int[] arr) {
        // TODO: 배열 모든 요소의 합 리턴
        int result = 0;

        for (int num : arr) {
            result += num;
        }

        return result;
    }
}
