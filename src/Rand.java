import java.util.Random;

class Rand {
    private static char[] CHARS = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z'
    };
    public static String make(int len) {
        String r = "";
        final Random random = new Random();
        for (int p = 0; p < len; p++) {
            r = r + CHARS[(char) random.nextInt(CHARS.length)];
        }
        return r;
    }
}
