import java.util.Scanner;
import java.util.*;

public class playWordle{
  public static void main(String[] args) {

    int count = 1;
    final String wordleOfTheDay = wordList.generateWord();
    Scanner uInput = new Scanner(System.in); 
      while(count < 7){
          System.out.println("Guess " + count + " of 6");
          System.out.println("Guess a word: ");
          String userInput = uInput.nextLine();
          guess userGuess = new guess(userInput);
        
          if(userInput.equalsIgnoreCase(wordleOfTheDay)){
              System.out.println("Congrats! You got it!");
              System.exit(0);
          }
          if(userInput.length() < 5 || userInput.length() > 5){
              continue;
          }
    
          if(!userInput.equals(wordleOfTheDay)){
              wordList.toWordleArray(wordleOfTheDay);
              guess.toGuessArray(userInput);
              compare.comparison(wordList.getWordleArray(), userGuess.getGuessArray());
              count ++;
          }  
      }
      System.out.println
      ("You're out of tries! The Wordle of the day was " + wordleOfTheDay);
      System.out.println("Try reading a dictionary...");
  }

}