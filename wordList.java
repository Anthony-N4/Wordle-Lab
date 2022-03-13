public class wordList {
  private static String wordle = "";
  private static String[] wordleArray = new String[5];
  
  public static String generateWord(){
    String[] wordList = {"Abuse","Spite","Theme","Pitch","Basis","Board","Issue","Chief","Scale","Reply",
                        "Doubt","Panel","Depth","Enemy","Event","Prize","Faith","Reply","Frank","Glass",
                        "Horse","Knife","Limit","Noise","Phase","Radio","River","Shock","Space","While",};
    int num = (int)(Math.random()*31);
    wordle = wordList[num];
    return wordList[num];
  }
      
  public static String getWord(){
      return wordle;
  }   
  public static String[] toWordleArray(String input){
      for(int i=0; i<5; i++){
      wordleArray[i] = input.substring(i,i+1);
      }
      return wordleArray;
  }
  public static String[] getWordleArray(){
      return wordleArray;
  }
}
