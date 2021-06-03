public class RandTest {
    public static void main(String[] args) {
        int length = 10;
        Assert.equals(Rand.make(length).length(), length);
    }
}
