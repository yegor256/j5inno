import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RandTest {
  static final int property_ContainsOnlyUpperCaseLatinLetters_NUM_RUNS = 100;
  static final int testStringLen = 20;

  private static Set<Character> CHARS = new HashSet<>(Arrays.asList(
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
      'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
      'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z'
  ));

  private static boolean property_ContainsOnlyUpperCaseLatinLetters(String text) {
    for (char c : text.toCharArray()) {
      if (!CHARS.contains(c)) {
        return false;
      }
    }

    return true;
  }

  public static void main(String... args) {
    for (int i = 0; i < property_ContainsOnlyUpperCaseLatinLetters_NUM_RUNS; i++) {
      Rand.make(testStringLen);
    }
  }
}
