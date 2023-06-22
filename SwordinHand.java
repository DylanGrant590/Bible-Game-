import java.util.Random;
import java.util.Scanner;

public class SwordinHand {
public static void main(String[] args) {
	
	//Loops menu
	SwordinHand menu = new SwordinHand();
    menu.display();
	} 

    //System objects
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

  	String[] verses = {"Genesis 6:8", "1 Peter 5:10", "John 1:17", "James 4:6", "Ephesians 2:8", 
  			"Judges 6:17", "Psalm 84:11", "Zechariah 12:10", "Acts 15:11", "Romans 3:24"};
  	
	//Displays the rules of the game to the user.
	public void display() {
	System.out.println("#########################");
	System.out.println("Welcome to Sword in Hand!");
	System.out.println("#########################");
	System.out.println("\nHere are the rules of the game: ");
	System.out.println("\n1)\tEveryone should have their Bible closed.");
	System.out.println("\n2)\tEveryone lifts their closed Bible with the spine in the palm of their hand, "
			+ "to head level or higher.");
	System.out.println("\n3)\tThe leader says the book, chapter and verse and everyone repeats the book, "
			+ "chapter and verse.");
	System.out.println("\n4)\tThe leader says \"ready\" and then shouts \"go!\"");
	System.out.println("\n5)\tEveryone brings their Bibles down and turns to the verse as quickly as possible.");
	System.out.println("\n6)\tAs soon as a person finds the verse they stand up. "
			+ "The leader recognizes the first person to stand "
			+ "and that person reads the verse out loud to the others.");
	System.out.println("\n7)\tThe person who finds the most verses first wins the round; "
			+ "in a larger group, the side (team) with the most verses found first, wins.");
	System.out.println("\n8)\tAn extra point can be given to the person who correctly identifies"
			+ " the word that is found in each of the 10 Bible verses.");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    
	//Allows user to enter an option to either play or quit the game.
	System.out.println("");
	System.out.println("***********************************************");
	System.out.println("Please enter a number from the following menu: ");
	System.out.println("\t1) Play the game");
	System.out.println("\t2) Exit the game");
	System.out.println("***********************************************");
	
	int input = scanner.nextInt();
	
	//Displays a random Bible verse to the user.
	if (input == 1) {
		String verse = verses[random.nextInt(verses.length)];
		System.out.println("\n" + verse + " has been given.");
		
	//Displays a message to the user when they close the program.
	}else if (input == 2){ 
    	System.out.println("----------------------");
        System.out.println("Thank you for playing!"); 
        System.out.println("----------------------"); 
        System.exit(0);
     
    //Displays an error message to the user if they enter an incorrect option.
	}else {
        System.out.println("\nInvalid selection!"); //Displays a message if an invalid option is entered. 
        display();
    
        scanner.close();
		}
	}
} 