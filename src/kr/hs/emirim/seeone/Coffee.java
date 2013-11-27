package kr.hs.emirim.seeone;

public class Coffee {
	public static final int ESPRESSO = 0;
	public static final int AMERICANO = 1;
	public static final int CAFFELATTE = 2;
	public static final int CAPPUCCINO = 3;
	public static final int CAFFEMOCHA = 4;
	public static final int CARAMELMACHIATTO = 5;

	int mChoice;
	boolean mShot;
	boolean mMilk;
	boolean mWhipping;
	boolean mHotWater;
	boolean mChocoSyrup;
	boolean mVanillaSyrup;
	boolean mCinnamonPowder;
	boolean mCaramelDrizzle;
	boolean mCup;

	public Coffee( int choice, boolean shot, boolean milk, boolean whipping, 
			boolean hotwater, boolean chocoSyrup, boolean vanilla,
			boolean cinnamonpowder, boolean carameldrizzle, boolean cup) {
		mChoice = choice;
		mShot = shot;
		mMilk = milk;
		mWhipping = whipping;
		mHotWater = hotwater;
		mChocoSyrup = chocoSyrup;
		mVanillaSyrup = vanilla;
		mCinnamonPowder = cinnamonpowder;
		mCaramelDrizzle = carameldrizzle;
		mCup = cup;
	}
}