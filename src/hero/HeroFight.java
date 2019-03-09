package hero;

public class HeroFight {
	/*
	 * A hero is on his way to the castle to complete his mission. However, he's
	 * been told that the castle is surrounded by some powerful dragons!
	 * Each dragon takes 2 bullets to be defeated, but our hero has no idea how many
	 * bullets he should carry.. Assuming he's gonna grab a specific given number of
	 * bullets and move forward to fight a specific given number of dragons,
	 * will he survive? Return True if yes, False otherwise :)
	 */
	public static boolean hero(int bullets, int dragons) {
		// TODO Write your method here
		if(bullets/2>=dragons) {
			return true;
		} else {
			return false;
		}
	}
}
