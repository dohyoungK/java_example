import java.util.HashMap;

public class IsMember_22 {
    public static void main(String[] args) {

        HashMap<String, String> member = new HashMap<String, String>(){{
            put("kimcoding", "1234");
            put("parkhacker", "qwer");
        }};
        System.out.println(isMember(member, "parkhacker", "qwer"));
        System.out.println(isMember(member, "parkhacker", "qw"));
    }

    public static boolean isMember(HashMap<String, String> member, String username, String password) {
        //TODO.. HashMap과 Key, Value 쌍을 입력받아
        // HashMap의 Entry 중 해당 Entry와 일치하는게 존재하는지 여부 리턴

        for (String name : member.keySet()) {
            if (username.equals(name) && password.equals(member.get(name))) return true;
        }
        return false;
    }
}
