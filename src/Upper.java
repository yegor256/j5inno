class Upper {
    public static String up(String text) {
        String r = "";
        for (int p = 0; p < text.length(); p = p + 1) {
            r = r + Character.toUpperCase(text.charAt(p));
        }
        return r;
    }
}
