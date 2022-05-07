package doublepointer;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));

    }
    public static String reverseWords(String s) {
        String trim = s.trim();
        String[] split = trim.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = split.length - 1; i >= 0 ; i--) {
            stringBuilder.append(split[i] + " ");
        }
        String trim1 = stringBuilder.toString().trim();
        return trim1;



    }
}
