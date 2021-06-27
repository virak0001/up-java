import java.util.Scanner;

public class Task5 {

  public static void main(String[] args) {
	  char exist;
	boolean isTrue = true;
    do {
    Scanner input = new Scanner(System.in);
    int count = 0;
    int randomNum = 1 + (int) (Math.random() * 5);
    System.out.println(randomNum);
    System.out.println("Guess My Number Game");
    System.out.print("Enter a guess between 1 and 6 : ");
    int guess = input.nextInt();
    if(guess < randomNum){
      count++;
      System.out.println("Too low! The random number " + randomNum);
    }else if(guess > randomNum) {
      count++;
      System.out.println("Too high! The random number " + randomNum);
    } else if(guess == randomNum) {
    	count++;
        System.out.println("Correct! You got it in " + count + " guesses!");
    }
    System.out.print("Do you want to play (Y or N) ?");
    exist = input.next().charAt(0); 
    input.close();
    }while(exist == 'y');
  }
}