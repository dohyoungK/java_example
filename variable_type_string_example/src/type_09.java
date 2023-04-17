public class type_09 {
    public static String type() {
        int num;
        char thing;

        //TODO : thing에는 'A' 할당하기, num에는 3 할당하기
        num = 3;
        thing = 'A';
        //아래 코드는 수정하지 말아야 합니다.
        return goCheck(num, thing);
    }

    //아래 메소드는 수정하지 말아야 합니다.
    public static String goCheck(int num, char thing) {
        return String.format("코딩아, 공구함에 있는 건전지말야. %c가 %d개 들어있는게 맞니?", thing, num);
    }

    public static void main(String[] args) {
        System.out.println(type());
    }
}
