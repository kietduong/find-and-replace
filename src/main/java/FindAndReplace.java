class FindAndReplace {
  public static String replaceWordsInSentence(String sentence, String wordToReplace, String replacingWord) {
    String replacedPhrase = sentence.replaceAll(wordToReplace, replacingWord);
    return replacedPhrase;
  }

}
