public class getRunCatDistance_06 {
    public static int getRunCatDistance(int speed, int time) {
        int distance;
        // TODO: 속력(speed), 시간(time)이 숫자로 주어졌을 때, 이동한 거리를 변수 distance에 할당하여 리턴하는
        // getRunCatDistance 함수를 작성하세요.
        distance = speed * time;

        //아래의 코드는 수정하지 말아야 합니다
        return distance;
    }

    public static void main(String[] args) {
        int dist = getRunCatDistance(3, 3);
        System.out.println(dist);
    }
}
