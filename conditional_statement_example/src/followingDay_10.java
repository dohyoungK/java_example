public class followingDay_10 {
    public static void main(String[] args) {
        System.out.println(followingDay("화요일"));
        System.out.println(followingDay("ㅁ요일"));
    }

    public static String followingDay(String day) {
        // TODO: 입력받은 요일의 다음 요일 리턴
        String result;

        switch (day) {
            case "월요일":
                result = "화요일";
                break;

            case "화요일":
                result = "수요일";
                break;

            case "수요일":
                result = "목요일";
                break;

            case "목요일":
                result = "금요일";
                break;

            case "금요일":
                result = "토요일";
                break;

            case "토요일":
                result = "일요일";
                break;

            case "일요일":
                result = "월요일";
                break;

            default:
                result = "올바른 요일이 아닙니다";
                break;
        }

        return result;
    }
}
