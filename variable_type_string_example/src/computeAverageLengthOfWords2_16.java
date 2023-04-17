public class computeAverageLengthOfWords2_16 {
    public static int computeAverageLengthOfWords2(String word1, String word2) {
        // TODO: (word1 길이 + word2 길이) / 2 해서 평균 길이구하기, 구한 평균길이를 내림해서 result에 저장하기
        int result;
        double num = (word1.length() + word2.length()) / 2;
        result = (int) Math.floor(num);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(computeAverageLengthOfWords2("code", "codes"));
    }
}
