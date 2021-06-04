class Rand {
    public static String make(int len) {
        String r = "";
        for (int p = 0; p < len; p = p + 1) {
            RandomChar randomChar = new RandomChar();
            r = r + randomChar.value();
        }
        return r;
    }
}
