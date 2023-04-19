public class getMaxNumberFromString_12 {
    public static void main(String[] args) {
        System.out.println(getMaxNumberFromString("12375"));
    }

    public static int getMaxNumberFromString(String str) {
        // TODO:
        int maxNum = 0;

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            System.out.println(num);
            if (num > maxNum) maxNum = num;
        }

        return maxNum;
    }
}
