public class compare {

  private static String[] returnLine = new String[5];
  private static String temp;
  
  public static void comparison(String[] word, String[] guess){
  String wordle = wordList.getWord();
     
    for(int i=0; i<5; i++){
        if(word[i].equals(guess[i])){
            returnLine[i] = word[i];
        }
        else if(word[i].contains(guess[i])){
            returnLine[i] = "+";
        }
        else{
            returnLine[i] = "*";
        }
    }
    for(String element : returnLine){
        System.out.print(element);
        temp = returnLine.toString();
    }
    System.out.println();
  }
}
