public class convertScoreToGradeWithPlusAndMinus_13 {
    public static void main(String[] args) {
        System.out.println(convertScoreToGradeWithPlusAndMinus(91));
        System.out.println(convertScoreToGradeWithPlusAndMinus(69));
    }

    public static String convertScoreToGradeWithPlusAndMinus(int score) {
        // TODO: 90 ~ 100 = A
        // TODO: 80 ~ 89 = B
        // TODO: 70 ~ 79 = C
        // TODO: 60 ~ 69 = D
        // TODO: 0 ~ 59 = F
        // 각 등급의 최고점보다 7점 이하면 - () 60 61 62 -
        // 각 등급의 최저점보다 8점 이상이면 + (F는 빼고) 68 69 + (100점을 추가로)
        String result;

        if (score >= 90 && score <= 100) {
            result = "A";
            if (score < 93) {
                result += "-";
            }
            if (score >= 98) {
                result += "+";
            }
        } else if (score >= 80 && score <= 89){
            result = "B";
            if (score < 83) {
                result += "-";
            }
            if (score >= 88) {
                result += "+";
            }
        } else if (score >= 70 && score <= 79){
            result = "C";
            if (score < 73) {
                result += "-";
            }
            if (score >= 78) {
                result += "+";
            }
        } else if (score >= 60 && score <= 69){
            result = "D";
            if (score < 63) {
                result += "-";
            }
            if (score >= 68) {
                result += "+";
            }
        } else if (score < 60 && score >= 0){
            result = "F";
        } else {
            result = "INVALID SCORE";
        }

        return result;
    }
}
