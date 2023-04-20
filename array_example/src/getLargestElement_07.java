public class getLargestElement_07 {
    public static void main(String[] args) {
        System.out.println(getLargestElement(new int[]{1,5,3}));
    }

    public static int getLargestElement(int[] arr) {
        // TODO: 배열 중 가장 큰 요소 리턴
        int maxNum = arr[0];

        for (int num : arr) {
            if (num > maxNum)   maxNum = num;
        }

        return maxNum;
    }
}
