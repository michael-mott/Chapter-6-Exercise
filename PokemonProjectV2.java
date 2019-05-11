import java.util.*;
public class PokemonProjectV2 {

	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String username = introduction();
		int numberOfPokemon = greeting(username);
		int sum = 0, health = 30*numberOfPokemon;
		String direction = direction();
		if (doQuit(direction)) {
			System.out.println("You chose to end the game.");
		}else {
		int randomizer = (int)randomNumber(1, 21);
		sum = obstacle(randomizer, sum);
		health = healthCaluclator(health, randomizer);
		}
		while(!doQuit(direction) && sum < numberOfPokemon && health > 0) {
			direction = direction();
			if (doQuit(direction)) {
				System.out.println("You chose to end the game.");
			}else {
			int randomizer = (int)randomNumber(1, 20);
			sum = obstacle(randomizer, sum);
			health = healthCaluclator(health, randomizer);	
			}
		}
		if (sum == numberOfPokemon) {
			System.out.println("Unbelievable! You have beaten the game!");
		}
		if (health == 0) {
			System.out.println("You died. Try a different route next time.");
		}
		System.out.println("Thank you for playing, enjoy your day.");

	}
	private static int healthCaluclator(int health, int randomizer) {
		if (randomizer <= 12) {
			health = health - 10;
		}
		if (randomizer >= 19) {
			health = health - 20;
		}
		if (health == 0) {
			System.out.println("The journey appears to have been too much for you.");
		}else
			System.out.println("You have " + health + "HP left.");
		return health;
	}
	private static int obstacle(int random, int sum) {
		 if (random == 1 || random == 2) {
			 llamaArt();
		 }
		 if (random == 3 || random == 4) {
			 islandArt();
		 }
		 if (random == 5 || random == 6) {
			 dragonArt();
		 }
		 if (random == 7 || random == 8) {
			 castleArt();
		 }
		 if (random == 9 || random == 10) {
			 cliffArt();
		 }
		 if (random == 11 || random == 12) {
			 locustArt();
		 }
		 if (random == 19) {
			 volcanoArt();
		 }
		 if (random == 20) {
			 hankArt();
		 }
		 if (random == 13 || random == 14) {
			 pikachuArt();
			 sum++;
		 }
		 if (random == 15 || random == 16) {
			 eeveeArt();
			 sum++;
		 }
		 if (random == 17) {
			 meowthArt();
			 sum++;
		 }
		 if (random == 18) {
			 wigglytuffArt();
			 sum++;
		 }
		 System.out.println("You have " + sum + " Pokemon.");
		 return sum;
	}
	private static String introduction() {
		System.out.println("Hello, Welcome to Michael's Pokemon Text Game");
		System.out.println("What would you like your username to be?");
		String username = input.next();
		System.out.println("The game takes place in the Pokeverse. You are a trainer on a journey to catch pokemon.");
		return username;
	}
	private static int greeting(String name) {
		System.out.println("How many pokemon do you want to catch " + name + "?");
		int numberOfPokemon = input.nextInt();
		if (numberOfPokemon < 4) {
			System.out.println("Is that all the time you have today? Well good luck!");
		}
		if (numberOfPokemon >= 4) {
			System.out.println("That's an impressive goal! Good Luck");
		}
		return numberOfPokemon;
	}
	
	private static String direction() {
		System.out.println("Enter q to quit, r to go right, l to go left, or s to go straight.");
		String direction = input.next();
		if (!direction.equals("q") && !direction.equals("r") &&!direction.equals("l") &&!direction.equals("s")){
			System.out.println("Invalid prompt please try again");
			System.out.println("Enter q to quit, r to go right, l to go left, or s to go straight.");
			direction = input.next();
		}
		return direction;
	}
	private static boolean doQuit(String s) {
		if(s.equals("q")||s.equals("Q")) {
			return true;
		}else {
			return false;
		}
	}
	private static void llamaArt() {
		System.out.println("You ran into a fuzzy llama!");
		System.out.println("        _    _");
		System.out.println("       ( \\__//)");
		System.out.println("       .'     )");
		System.out.println("    __/b d  .  )");
		System.out.println("   (_Y_`,     .)");
		System.out.println("    `--'-,-'  )");
		System.out.println("         (   )");
		System.out.println("       (   )");
		System.out.println("       ( . )         .---.");
		System.out.println("      (    )        (     )");
		System.out.println("      (   . )      (  .    )");
		System.out.println("      (      )    (      .  ),");
		System.out.println("      ( .     `\"'`  .       `)\\");
		System.out.println("       (      .              .)\\");
		System.out.println("       ((  .      .   (   .   )\\\\");
		System.out.println("       ((       .    (        ) \\\\");
		System.out.println("        ((     )     _( .   . )  \\\\");
		System.out.println("       ( ( .   )\"'\"`(.(     )   ( ;");
		System.out.println("        ( (    )      ( ( . )     \\'");
		System.out.println("         |~(  )        |~(  )");
		System.out.println("         | ||~|        | ||~|");
		System.out.println("         | || |        | || |");
		System.out.println("        _| || |       _| || |");
		System.out.println("       /___(| |      /___(| |");
		System.out.println("          /___(         /___(");
		System.out.println("You spent a little bit too much time hugging it, and got several ticks.");
		System.out.println("You lost 10 HP.");
	}
	private static void islandArt() {
		System.out.println("Somehow you got stranded on a deserted island.");
		System.out.println("          ___   ____");
		System.out.println("        /' --;^/ ,-_\\     \\ | /");
		System.out.println("       / / --o\\ o-\\ \\\\   --(_)--");
		System.out.println("      /-/-/|o|-|\\-\\\\|\\\\   / | \\");
		System.out.println("       '`  ` |-|   `` '");
		System.out.println("             |-|");
		System.out.println("             |-|O");
		System.out.println("             |-(\\,__");
		System.out.println("          ...|-|\\--,\\_....");
		System.out.println("      ,;;;;;;;;;;;;;;;;;;;;;;;;,");
		System.out.println("~~,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,~~~~~~~~~~~~~~~~~~~");
		System.out.println("~;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,  ______   --------- ");
		System.out.println("You lost 10 HP.");
	}
	private static void dragonArt() {
		System.out.println("You came across a dragon! RUN!");
		System.out.println("                \\||/");
		System.out.println("                |  @___oo");
		System.out.println("      /\\  /\\   / (__,,,,|");
		System.out.println("     ) /^\\) ^\\/ _)");
		System.out.println("     )   /^\\/   _)");
		System.out.println("     )   _ /  / _)");
		System.out.println(" /\\  )/\\/ ||  | )_)");
		System.out.println("<  >      |(,,) )__)");
		System.out.println(" ||      /    \\)___)\\");
		System.out.println(" | \\____(      )___) )___");
		System.out.println("  \\______(_______;;; __;;;");
		System.out.println("You lost 10 HP. Be happy it wasn't more!");
	}
	private static void castleArt() {
		System.out.println("You got thrown in the dungeons of a castle.");
		System.out.println("  / \\               / \\");
		System.out.println(" /   \\             /   \\");
		System.out.println("(_____)           (_____)");
		System.out.println(" |   |  _   _   _  |   |");
		System.out.println(" | O |_| |_| |_| |_| O |");
		System.out.println(" |-  |          _  | - |");
		System.out.println(" |   |   - _^_     |   |");
		System.out.println(" |  _|    //|\\\\  - |   |");
		System.out.println(" |   |   ///|\\\\\\   |  -|");
		System.out.println(" |-  |_  |||||||   |   |");
		System.out.println(" |   |   |||||||   |-  |");
		System.out.println(" |___|___|||||||___|___|");
		System.out.println("You lost 10 HP.");
	}
	private static void cliffArt() {
		System.out.println("You fell off a small cliff!");
		System.out.println("            _.-'```\"\"\"``\"-._");
		System.out.println("           /\"`                '.");
		System.out.println("           `':.,_               \"._");
		System.out.println("                 \\`'-._             `'-._");
		System.out.println("                  \\    `:._              `'-._          _");
		System.out.println("   _O/             |      \\ `:_                `\"--\"--\"``");
		System.out.println("     \\             |       \\   `:_");
		System.out.println("     /\\_           |      :|    \\ '.");
		System.out.println("     \\  `          |       |     |  `:_");
		
	}
	private static void locustArt() {
		System.out.println("You ran into a swarm of locusts!");
		System.out.println("                     ___ --.");
		System.out.println("                   .`   '.  \\");
		System.out.println("              ,_          | |");
		System.out.println("       .\"\"\"\"\"\"|\\'.\"\"\"\"\"\"-./-;");
		System.out.println("      |__.----| \\ '.      |0 \\");
		System.out.println("   __/ /  /  /|  \\  '.____|__|");
		System.out.println("   `\"\"\"\"\"\"\"\"`\"|`\"\"'---'|  \\");
		System.out.println("         .---'        /_  |_");
		System.out.println("You lost 10 HP.");
	}
	private static void volcanoArt() {
		System.out.println("Mt Doom, a volcano, errupted!");
		System.out.println("                      ooO");
        System.out.println("                     ooOOOo");
		System.out.println("                   oOOOOOOoooo");
		System.out.println("                 ooOOOooo  oooo");
		System.out.println("                /vvv\\");
		System.out.println("               /V V V\\");
		System.out.println("              /V  V  V\\");
		System.out.println("             /         \\");
		System.out.println("            /           \\");
		System.out.println("          /               \\");
		System.out.println("__       /                 \\ ");
		System.out.println("You lost 20 HP.");
		
	}
	private static void hankArt() {
		System.out.println("You ran into an evil, greedy goblin!");
		System.out.println("             ,      ,");
		System.out.println("            /(.-\"\"-.)\\");
		System.out.println("        |\\  \\/      \\/  /|");
		System.out.println("        | \\ / =.  .= \\ / |");
		System.out.println("        \\( \\   o\\/o   / )/");
		System.out.println("         \\_, '-/  \\-' ,_/");
		System.out.println("           /   \\__/   \\");
		System.out.println("           \\ \\__/\\__/ /");
		System.out.println("         ___\\ \\|--|/ /___");
		System.out.println("       /`    \\      /    `\\");
		System.out.println("      /       '----'       \\");
		System.out.println("He stole all of your supplies, you lost 20 HP.");
	}
	private static void pikachuArt() {
		System.out.println("Congratulations, you caught a Pikachu!");
		System.out.println("       ,___          .-;'"); 
		System.out.println("       `\"-.`\\_...._/`.`");  
		System.out.println("    ,      \\        /"); 
		System.out.println(" .-' ',    / ()   ()\\"); 
		System.out.println("`'._   \\  /()    .  (|"); 
		System.out.println("    > .' ;,     -'-  /");
		System.out.println("   / <   |;,     __.;");
		System.out.println("   '-.'-.|  , \\    , \\");
		System.out.println("     `>.|;, \\_)    \\_)"); 
		System.out.println("       `-;     ,    /"); 
		System.out.println("          \\    /   <"); 
		System.out.println("           '. <`'-,_)"); 
		System.out.println("            '._)");
	}
	private static void eeveeArt() {
		System.out.println("Congratulations, you caught a Eevee!");
		System.out.println("       ;-.               ,"); 
		System.out.println("        \\ '.           .'/"); 
		System.out.println("         \\  \\ .---. .-' /"); 
		System.out.println("          '. '     `\\_.'");
		System.out.println("            |(),()  |     ,");
		System.out.println("            (  __   /   .' \\");
		System.out.println("           .''.___.'--,/\\_,|");
		System.out.println("          {  /     \\   }   |"); 
		System.out.println("           '.\\     /_.'    /"); 
		System.out.println("            |'-.-',  `; _.'");
		System.out.println("            |  |  |   |`"); 
		System.out.println("            `\"\"`\"\"`\"\"\"`  ");
	}
	private static void meowthArt() {
		System.out.println("Congratulations, you caught a Meowth!");
		System.out.println("               .-. \\_/ .-."); 
		System.out.println("               \\.-\\/=\\/.-/"); 
		System.out.println("            '-./___|=|___\\.-'");
		System.out.println("           .--| \\|/`\"`\\|/ |--.");
		System.out.println("          (((_)\\  .---.  /(_)))");
		System.out.println("           `\\ \\_`-.   .-'_/ /`_");
		System.out.println("             '.__       __.'(_))");
		System.out.println("                 /     \\     //");
		System.out.println("                |       |__.'/");
		System.out.println("                \\       /--'`");
		System.out.println("            .--,-' .--. '----.");
		System.out.println("           '----`--'  '--`----'");
	}
	private static void wigglytuffArt() {
		System.out.println("Congratulations, you caught a Wigglytuff!");
		System.out.println("           .~~-.      _.    "); 
		System.out.println("         .''..    (_~)  ) _.-'. ;"); 
		System.out.println("         '.'..'..-(_~ _-'*. .'.'");
		System.out.println("           ''.'.. _ ~~  _  ';'");
		System.out.println("            .''. (_)   (_)  '."); 
		System.out.println("            ;      \"...\"     '.");
		System.out.println("        .''.'.   .''`-'''.    '.''.");
		System.out.println("        '.  '   ;         ;    ;  ;");
		System.out.println("          '.   ;           ;   ' ; ");
		System.out.println("           '.  ;           ;    ;  ");
		System.out.println("            '.  ;         ;   .'   ");
		System.out.println("            .'...:..___..:..':.    "); 
		System.out.println("         .''     ..'    '...   ~)  "); 
		System.out.println("        (.....'''           ''''    ");
		System.out.println("           ,                        "); 
	}
	private static double randomNumber(int start, int end) {
		double number= start+ Math.random()*(end-start)+start;
		return number;
	}
}

// 1. Import class scanner.
// 2. Call Method Introduction.
//		a. Introduce the game.
//		b. Ask the username
//		c. return name store as parameter.
// 3. Call Method greeting
//		a. ask how many pokemon they want to catch
//		b. respond with two possible regarding the number inputed
//		c. return number and store as variable
// 4. Call Method direction
// 		a. prompt user of valid inputs
//		b. if invalid input respond and ask for new input
//		c. return the string of direction.
// 5. if direction is q, then respond appropriately and end, else continue on
//		a. randomNumber();
//		b. Obstacle();
//		c. healthCalculator();
// 6. While doQuit is false, pokemon is less than sum and health is greater than zero ( do up to step 12, repeat until false )
//		a. doQuit method is a boolean if else statement that is determined by whether or not string direction is q
// 7. Call Method Direction
// 8. if direction is q, then respond appropriately and end, else continue on
// 9. Call Method randomNumber
//		a. create random integer and return to main where we store it
// 10. Call Method obstacle
//		a. if statements to determine the scenario that occurs Call corresponding Art Method
//		b. If its a pokemon increase sum of pokemons by 1
//		c. Return that variable and update/store it in main
// 11. Go to corresponding Art Method, they are labeled clearly and they only draw the ascii art of it with a sentence or two
// 12. Call Method health calculator
//		a. If random number is a bad scenario decrease health ( initialized in main ) by ten or twenty
//		b. return the updated value of health
// 13. Thank the person for playing and respond according to what happened in the outcome.