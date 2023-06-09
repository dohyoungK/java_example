import java.util.*;

public class computeAverageOfMaleMember_05 {
    public static void main(String[] args) {

        Member coding = new Member("coding", "Female", 25);
        Member hacker = new Member("hacker", "Male", 30);
        Member ingi = new Member("ingi", "Male", 32);
        List<Member> members = Arrays.asList(coding, hacker, ingi);
        System.out.println(computeAverageOfMaleMember(members));
    }

    public static double computeAverageOfMaleMember(List<Member> members) {
        //구현된 Member 클래스의 getName(), getGender(), getAge() 메소드로 해당 Member 클래스의 name, gender, age를 확인할 수 있습니다.
        //TODO.. Member 타입의 List에서 남성 회원들의 평균 나이 리턴

        if (members.isEmpty()) return 0;
        if (members.stream().noneMatch(element -> element.getGender() == "Male")) return 0;


        return members.stream()
                .filter(element -> element.getGender() == "Male")
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
    }

    // 아래 코드는 변경하지 마세요.
    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
