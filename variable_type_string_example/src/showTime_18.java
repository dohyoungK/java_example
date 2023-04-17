public class showTime_18 {
    public static String showTime(int hour, int min, int sec) {
        // TODO: 입력 받은 시간, 분, 초 저장
        String result;
        result = String.format("현재 시각은 %d시 %d분 %d초 입니다.", hour, min, sec);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(showTime(3,30,40));
    }
}
