import java.util.Random;

class Rand {
    private static char[] CHARS = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z'
    };
    public static String make(int len) {
        String r = "";
        for (int p = 0; p < len; p = p + 1) {
            r = r + (char) new Random().nextInt(26);
        }
        return r;
    }
}
