class ReverseTest {
    public static void main(String... args) {
        Assert.equals(Reverse.reverse("123"), "321");
        Assert.equals(Reverse.reverse("hello"), "olleh");
        Assert.equals(Reverse.reverse("привет"), "тевирп");
    }
}
