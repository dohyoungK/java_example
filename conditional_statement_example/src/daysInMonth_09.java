public class daysInMonth_09 {
    public static void main(String[] args) {
        System.out.println(daysInMonth(2));
        System.out.println(daysInMonth(1));
    }

    public static int daysInMonth(int month) {
        // TODO: 입력받은 달에 몇일이 있는지 리턴(31일: 1 3 5 7 8 10 12, 30일: 4 6 9 11, 28일 :2)
        int result;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;

            case 2:
                result = 28;
                break;

            default:
                result = 31;
                break;
        }

        return result;
    }
}
