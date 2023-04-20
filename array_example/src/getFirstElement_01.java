public class getFirstElement_01 {
    public static void main(String[] args) {
        System.out.println(getFirstElement(new int[]{1, 2, 3}));
        System.out.println(getFirstElement(new int[]{}));
    }

    public static int getFirstElement(int[] arr) {
        // TODO: 배열 첫 요소 리턴
        if (arr.length == 0)    return -1;

        return arr[0];
    }
}
