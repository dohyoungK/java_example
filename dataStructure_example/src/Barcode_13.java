public class Barcode_13 {
    public static void main(String[] args) {

        System.out.println(barcode(7));
    }

    public static String barcode(int len) {
        // TODO: 1,2,3 으로만 이루어진 len길이의 수열 생성
        // 부분 수열이 중복되면 x, 생성된 모든 수열 중 가장 작은 수 찾기
        // dfs를 사용 -> 모든 수열을 생성할 수 있다.
        return dfs(len, "");
    }

    public static String dfs(int len, String str) {
        String[] nums = new String[]{"1", "2", "3"};
        if (str.length() == len) return str;

        for (int i = 0; i < nums.length; i++) {
            if (!isDuplicate(str + nums[i])) {
                String next = dfs(len, str + nums[i]);
                if (next != null) return next;
            }
        }

        return null;
    }

    public static boolean isDuplicate(String str) {
        for (int i = 1; i <= (int) str.length() / 2; i++) {
            for (int j = 0; j <= str.length() - 2 * i; j++) {
                String compare = str.substring(j, j + i);
                if (str.substring(j + i).startsWith(compare)) return true;
            }
        }

        return false;
    }
}
