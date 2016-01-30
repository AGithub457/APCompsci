package assignments.semester2;

public class Slogan {
    private static int count = 0;
    private String phrase;

    public Slogan(String str) {
        phrase = str;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String toString() {
        return phrase;
    }
}
