package critters;

public class ScoutCritter extends Critter {

	public ScoutCritter(int[][] Locations) {
	
		super(Locations, health, armor, speed, reward, name);



	}

	private static String		name		= "Scout";
	private static double 		health 		= 3;
	private static double 		speed		= 3;
	private static int			reward		= 3;
	private static double		armor		= 0.5;


}

