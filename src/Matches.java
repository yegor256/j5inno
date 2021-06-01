class Matches {
    private String text;
    public Matches(String t) {
        this.text = t;
    }
    public int count(String sub) {
        int c = 0;
        for (int i = 0; i < this.text.length(); i++) {
            if (this.text.substring(i, i + sub.length()).equals(sub)) {
                c += 1;
            }
        }
        return c;
    }
}
