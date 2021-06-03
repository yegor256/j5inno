import java.util.Random;

public class RandomChar {
    private char value;

    private static char[] CHARS = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z'
    };

    public RandomChar() {
        this.value = CHARS[new Random().nextInt(CHARS.length)];
    }

    public char value(){
        return value;
    }
}
