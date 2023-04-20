public class getNthElement_03 {
    public static void main(String[] args) {
        System.out.println(getNthElement(new int[]{1, 2, 3}, 2));
        System.out.println(getNthElement(new int[]{1, 2, 3}, 3));
        System.out.println(getNthElement(new int[]{}, 2));
    }

    public static int getNthElement(int[] arr, int index) {
        // TODO: 입력받은 인덱스의 배열 요소를 리턴
        if (arr.length == 0)    return -1;
        if (index >= arr.length)    return -2;

        return arr[index];
    }
}
