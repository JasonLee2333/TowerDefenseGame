package critters;

public class GruntCritter extends Critter{

	public GruntCritter(int[][] Locations) {
		
		super(Locations, health, armor, speed, reward, name);

	}

	private static String		name		= "Grunt";
	private static double 		health 		= 5;
	private static double 		speed		= 1.5;
	private static int			reward		= 5;
	private static double		armor		= 1;


}


