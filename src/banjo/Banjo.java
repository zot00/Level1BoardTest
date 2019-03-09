package banjo;

public class Banjo {
	/**
	 * Create a function which answers the question "Are you playing banjo?". If
	 * your name starts with the letter "R" or lower case "r", you are playing
	 * banjo!
	 * 
	 * The function takes a name as its only argument, and returns one of the
	 * following strings:
	 * 
	 * <pre>
	 * name + " plays banjo" 
	 * name + " does not play banjo"
	 * </pre>
	 * 
	 * Names given are always valid strings.
	 * 
	 **/
	public static String areYouPlayingBanjo(String name) {
		// TODO Write your method here
		if (name.charAt(0) == 'r' || name.charAt(0) == 'R') {
			return name + " plays banjo";
		} else {
			return name + " does not play banjo";
		}
	}
}