import java.util.*;

public class ComputeCountOfFemaleMember_04 {
    public static void main(String[] args) {

        Member coding = new Member("coding", "Female");
        Member hacker = new Member("hacker", "Male");
        List<Member> members = Arrays.asList(coding, hacker);
        System.out.println(computeCountOfFemaleMember(members));
    }

    public static long computeCountOfFemaleMember(List<Member> members) {
        //구현된 Member 클래스의 getName(), getGender() 메소드로 해당 Member 클래스의 name, gender를 확인할 수 있습니다.
        //TODO.. Member 타입의 List를 입력받아
        // 여성 회원 수 리턴

        return members.stream()
                .filter(element -> element.getGender() == "Female")
                .count();
    }

    // 아래 코드는 변경하지 마세요.
    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }
}
