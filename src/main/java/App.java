import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a sentence");
    String sentenceInput = console.readLine();
    System.out.println("Enter word you would like to replace");
    String wordToReplaceInput = console.readLine();
    System.out.println("What would you like to replace it with?");
    String replacingWordInput = console.readLine();
    System.out.println(FindAndReplace.replaceWordsInSentence(sentenceInput, wordToReplaceInput, replacingWordInput));

  }
}
