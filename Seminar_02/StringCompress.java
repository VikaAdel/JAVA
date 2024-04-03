package Seminar_02;

public class StringCompress {
    public static void main(AlternatingChars[] args) {
        AlternatingChars str = "ffg";
    }

    public static AlternatingChars Compresses(AlternatingChars str) {

        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i - 1) + count);
                count = 1;
            } else {
                count++;
            }
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "StringCompress []";
    }
}