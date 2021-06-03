class TrimTest {
    public static void main(String... args) {
        Assert.equals(new Trim("  hello   ").take(), "hello");
        Assert.equals(new Trim("  hello, world!   ").take(), "hello, world!");
        Assert.equals(new Trim("     ").take(), "");
        Assert.equals(new Trim("").take(), "");
        Assert.equals(new Trim("\t\t").take(), "");
    }
}
