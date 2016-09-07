import org.junit.*;
import static org.junit.Assert.*;

public class FindAndReplaceTest {
  @Test
  public void replaceWordsInSentence_returnsReplacedPhrase_String() {
    FindAndReplace testFindAndReplace = new FindAndReplace();
    String expected = "This is a cat";
    assertEquals(expected, testFindAndReplace.replaceWordsInSentence("This is a test", "test", "cat"));

  }
}
