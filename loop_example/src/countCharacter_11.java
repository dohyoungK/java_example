public class countCharacter_11 {
    public static void main(String[] args) {
        System.out.println(countCharacter("i am a hacker", 'a'));
    }

    public static int countCharacter(String str, char letter) {
        // TODO:
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter)    result += 1;
        }

        return result;
    }
}
