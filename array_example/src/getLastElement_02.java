public class getLastElement_02 {
    public static void main(String[] args) {
        System.out.println(getLastElement(new int[]{1, 2, 3}));
        System.out.println(getLastElement(new int[]{}));
    }

    public static int getLastElement(int[] arr) {
        // TODO: 배열의 마지막 요소 리턴
        if (arr.length == 0)    return -1;

        return arr[arr.length - 1];
    }
}
