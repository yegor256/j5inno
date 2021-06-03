import java.util.ArrayList;

class Reverse {
    public static String reverse(String text) {
        StringBuilder r = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();
        // credits to https://stackoverflow.com/a/1527891/2204326 as per CC BY-SA 3.0
        final int length = text.length();
        for (int offset = 0; offset < length; /*noop*/) {
            final int codepoint = text.codePointAt(offset);
            list.add(codepoint);
            offset += Character.charCount(codepoint);
        }
        for (int i = list.size(); i > 0; i--) {
            final int codepoint = list.get(i - 1);
            r.appendCodePoint(codepoint);
        }
        return r.toString();
    }
}
