import java.util.Arrays;
public class createPhoneNumber_18 {
    public static void main(String[] args) {
        createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    public static String createPhoneNumber(int[] arr) {
        // TODO: 길이가 8일때(010 X), 11일때 (010, 011)
        // 앞의 세자리는 ()로 묶어주고, 뒤의 8자리는 4자리씩 끊어서 "-" 붙여주기
        String result = "";
        String number = Arrays.toString(arr);
        number = number.substring(1, number.length() - 1);
        number = number.replaceAll(",", "");
        number = number.replaceAll(" ", "");


        if (arr.length == 8) {
            result += "(010)";
            result += number.substring(0, 4) + "-" + number.substring(4);
            // substring (0,4) "-" sub....
        }
        else {
            result += "(" + number.substring(0, 3) + ")";
            result += number.substring(3, 7) + "-" + number.substring(7);
            // substring (3,7) "-" sub....(7)
        }
        System.out.println(result);

        return "";
    }
}
