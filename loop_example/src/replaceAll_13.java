public class replaceAll_13 {
    public static void main(String[] args) {
        System.out.println(replaceAll("loop", 'o', 'a'));
    }

    public static String replaceAll(String str, char from, char to) {
        // TODO:
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == from)  result += to;
            else    result += str.charAt(i);
        }

        return result;
    }
}
