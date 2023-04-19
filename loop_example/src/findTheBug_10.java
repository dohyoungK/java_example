public class findTheBug_10 {
    public static void main(String[] args) {
        System.out.println(findTheBug("wo#rd"));
    }

    public static int findTheBug(String word) {
        // TODO: for (int i = 0; i < word.length(); i++)
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '#')  return i;
        }

        return -1;
    }
}
