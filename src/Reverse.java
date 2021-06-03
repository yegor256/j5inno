class Reverse {
    public static String reverse(String text) {
        StringBuilder r = new StringBuilder();
        for (int p = text.length(); p > 0; p = p - 1) {
            r.append(text.charAt(p - 1));
        }
        return r.toString();
    }
}
