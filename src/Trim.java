class Trim {
    private final String text;
    public Trim(String t) {
        this.text = t;
    }
    public String take() {
        return text.trim();
    }
}
