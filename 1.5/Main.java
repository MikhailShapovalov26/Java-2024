public class Main {

    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";
    public static void main(String[] args) {

        int count = 0;
            for (int i = 0; i < TEXT.length() - 2; i++) {
                String isTimeText = TEXT.substring(i,i+3);

                if (isTimeText.equals(PATTERN)) {
                    count += 1;
                }
            }
        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}
