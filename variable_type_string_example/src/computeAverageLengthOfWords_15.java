public class computeAverageLengthOfWords_15 {
    public static int computeAverageLengthOfWords(String word1, String word2) {
        // TODO: word1 단어 길이저장, word2 단어 길이저장, result에 평균 길이 저장하기
        int result;
        result = (word1.length() + word2.length()) / 2;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(computeAverageLengthOfWords("code", "programs"));
    }
}
