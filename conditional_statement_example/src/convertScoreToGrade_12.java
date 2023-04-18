public class convertScoreToGrade_12 {
    public static void main(String[] args) {
        System.out.println(convertScoreToGrade(90));
        System.out.println(convertScoreToGrade(111));
    }

    public static char convertScoreToGrade(int score) {
        // TODO:
        char result;

        if (score >= 90 && score <= 100) {
            result = 'A';
        } else if (score >= 80 && score <= 89){
            result = 'B';
        } else if (score >= 70 && score <= 79){
            result = 'C';
        } else if (score >= 60 && score <= 69){
            result = 'D';
        } else if (score < 60 && score >= 0){
            result = 'F';
        } else {
            result = 'X';
        }

        return result;
    }
}
