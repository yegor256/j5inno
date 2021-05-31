class Assert {
    public static <T> void equals(T left, T right) {
        if (!left.equals(right)) {
            System.err.printf("%s not equal to %s\n", left, right);
            throw new AssertionError();
        }
    }
}
