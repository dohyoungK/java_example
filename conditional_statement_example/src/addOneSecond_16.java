public class addOneSecond_16 {
    public static void main(String[] args) {
        System.out.println(addOneSecond(23, 59, 59));
        System.out.println(addOneSecond(0, 32, 59));
    }

    public static String addOneSecond(int hour, int minute, int second) {
        // TODO: 시, 분, 초에서 1초 더한 시간을 리턴하기
        String result;

        second += 1;
        if (second >= 60) {
            minute += 1;
            second -= 60;
        }
        if (minute >= 60) {
            hour += 1;
            minute -= 60;
        }
        if (hour == 24) {
            hour = 0;
        }

        result = String.format("1초 뒤에 %d시 %d분 %d초 입니다", hour, minute, second);
        return result;
    }
}
