package critters;

public class TankCritter extends Critter {
	public TankCritter(int[][] Locations) {
		
		super(Locations, health, armor, speed, reward, name);
	

	}

	private static String		name		= "Tank";
	private static double 		health 		= 15;
	private static double 		speed		= 0.5;
	private static int			reward		= 10;
	private static double		armor		= 3;


}
