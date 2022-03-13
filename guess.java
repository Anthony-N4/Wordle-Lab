public class guess {

  private static String guess = "";
  private static String[] guessArray = new String[5];
  
  public guess(String userInput){
      guess = userInput;
  } 
  public static String getGuess(){
      return guess;
  }
  public static String[] toGuessArray(String input){
      for(int i=0; i<5; i++){
          guessArray[i] = input.substring(i,i+1); 
      }
      return guessArray;
  }
  public static String[] getGuessArray(){
      return guessArray;
  }
}
