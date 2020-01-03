public class HiddenWord{
private String word;

  public HiddenWord(String word){
    this.word = word;
  }

  public String getHint(String guess){
    int length = guess.length();
    for (int i = 0; i < length; i++ ) {
      if (guess.charAt(i) == word.charAt(i)) {

      }
    }
    return "sad";
  }
}
