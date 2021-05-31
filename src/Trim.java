class Trim {
    private final String text;

    public Trim(String t) {
        this.text = t;
    }

    public String take() {
        int start = 0;
        while (this.text.charAt(start) == ' ') {
            start++;
        }

        int end = this.text.length() - 1;
        while (this.text.charAt(end) == ' ') {
            end--;
        }

        return this.text.substring(start, end + 1);
    }
}
