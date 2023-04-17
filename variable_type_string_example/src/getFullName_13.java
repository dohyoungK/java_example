public class getFullName_13 {
    public static String getFullName(String firstName, String lastName) {
        // TODO: firstName, lastName 사이에 띄어쓰기 하나만 추가해서 return 해주기
        String result;
        result = firstName + " " + lastName;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFullName("Joe", "Smith"));
    }
}
