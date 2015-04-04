package towers;

import critters.Critter;
import game.Player;

public class Tower {	
	
	private int buyingCost;
	private int refundValue;
	private double range;
	private int power;
	private int rateofFire;
	private int level;
	private int upgradeCost;
	private int xPos;
	private int yPos;
	private boolean freezeTower;
	private Critter targetCritter;
	private final int reloadTime = 1;
	private static long lastAttackTime;
	//system time of last attack
	
	public Tower(int buyingCost, int refundValue, double range, int power, int rateofFire, 
			int level, int upgradeCost, int xPos, int yPos, boolean isFreezeTower) {
		// TODO Auto-generated constructor stub
		this.buyingCost = buyingCost;
		this.refundValue = refundValue;
		this.range = range;
		this.power = power;
		this.rateofFire = rateofFire;
		this.level = level;
		this.upgradeCost = upgradeCost;
		this.xPos = xPos;
		this.yPos = yPos;
		this.freezeTower = isFreezeTower;
		this.lastAttackTime = 0;
	}
	public Tower(int xPos, int yPos){
		this.buyingCost = 100;
		this.refundValue = 90;
		this.range = 100;
		this.power = 5;
		this.rateofFire = 2000;
		this.level = 1;
		this.upgradeCost = 200;
		this.xPos = xPos;
		this.yPos = yPos;
		this.freezeTower = false;
		this.lastAttackTime = 0;
	}
	
	
	public boolean canAttack(){
		if( (System.currentTimeMillis()-lastAttackTime)/1000 >= reloadTime){
			lastAttackTime = System.currentTimeMillis();
			return true;
		}
		else
			return false;
	}

	public void refundTower() { // credit of this tower's salvage value
											// is added to the user's account.
		Player.addCredits(refundValue);
	}

	public int getBuyingCost() { // getters and setters for the private
									// attributes of this object.
		return buyingCost;
	}

	public void setBuyingCost(int pBuyingCost) {
		buyingCost = pBuyingCost;
	}

	public double getRefundValue() {
		return refundValue;
	}

	public void setRefundValue(int pRefundValue) {
		refundValue = pRefundValue;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double pRange) {
		range = pRange;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int pPower) {
		power = pPower;
	}

	public double getRateofFire() {
		return rateofFire;
	}

	public void setRateofFire(int pRateofFire) {
		rateofFire = pRateofFire;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int pLevel) {
		level = pLevel;
	}

	public double getUpgradeCost() {
		return upgradeCost;
	}

	public void setUpgradeCost(int pUpgradeCost) {
		upgradeCost = pUpgradeCost;
	}
	
	public int getX(){
		return xPos;
	}
	
	public int getY(){
		return yPos;
	}
	
	public boolean isFreezeTower(){
		return freezeTower;
	}
	
	public long getTimeOfLastAttack(){
		return lastAttackTime;
	}
	public void setTimeOfLastAttack(long time){

		lastAttackTime = time;
	}
}
