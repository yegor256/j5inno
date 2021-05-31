class TrimTest {
    public static void main(String... args) {
        Assert.equals(new Trim("  hello   ").take(), "hello");
        Assert.equals(new Trim("  hello, world!   ").take(), "hello, world!");
    }
}
