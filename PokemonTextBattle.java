import java.util.*;
public class PokemonTextBattle {

	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String username = introduction();
		int numberOfPokemon = greeting(username);
		String direction = direction();
		boolean endOfGame = doQuit(direction);
		// while(!doQuit) {
		// }
	}
	private static String direction() {
		System.out.println("Enter q, r, l, or s");
		String direction = input.next();
		return direction;
	}
	private static String introduction() {
		System.out.println("Hello, Welcome to Michael's Pokemon Text Game");
		System.out.println("What would you like your usernmae to be?");
		String username = input.next();
		return username;
	}
	private static int greeting(String name) {
		System.out.println("How many pokemon do you want to catch " + name + "?");
		int numberOfPokemon = input.nextInt();
		return numberOfPokemon;
	}
	private static boolean doQuit(String s) {
		if(s.equals("q")||s.equals("Q")) {
			return true;
		}else {
			return false;
		}
	}

}
