class Inverse {
    private String text;

    public Inverse(String text) {
        this.text = text;
    }

    public String text() {
        StringBuilder r = new StringBuilder();
        for (int p = text.length() - 1; p > -1; p -= 1) {
            r.append(text.charAt(p));
        }
        return r.toString();
    }
}
