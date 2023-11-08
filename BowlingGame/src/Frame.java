/**
 * Represents a single frame out of the 10 frames
 */
public class Frame {

	/**
	 * pins knocked over in first roll of the frame
	 */
	private int firstRoll;

	/**
	 * pins knocked over in second roll of the frame<br>
	 */
	private int secondRoll;

	/**
	 *stores the live score for the frame
	 */
	private int temp;

	/**
	 * stores the bonus rolls (for strike/spare) for the frame
	 */
	private int bonus;

	/**
	 *stores the total points for the frame (including points
	 * from bonus rolls)
	 */
	private int points;

	/**
	 * Instance variable to denote if the frame was a Strike. <br>
	 */
	private boolean isStrike;

	/**
	 * Instance variable to denote if the frame was a Spare. <br>
	 */
	private boolean isSpare;

	/**
	 * Default constructor
	 */
	public Frame() {

		this.firstRoll = BowlingGame.EMPTY;
		this.secondRoll = BowlingGame.EMPTY;
		this.temp = 0;
		this.bonus = 0;
		this.points = 0;
		this.isSpare = false;
		this.isStrike = false;
	}


	public boolean isStrike() {
		return isStrike;
	}


	public void setStrike(boolean isStrike) {
		this.isStrike = isStrike;
	}


	public boolean isSpare() {
		return isSpare;
	}


	public void setSpare(boolean isSpare) {
		this.isSpare = isSpare;
	}


	public int getTemp() {
		return temp;
	}

	/**
	 * Adds the new pin value to temp and updates it's value
	 */
	public void addToTemp(int val) {
		this.temp += val;
	}


	public int getFirstRoll() {
		return firstRoll;
	}


	public void setFirstRoll(int firstRoll) {
		this.firstRoll = firstRoll;
	}


	public int getSecondRoll() {
		return secondRoll;
	}


	public void setSecondRoll(int secondRoll) {
		this.secondRoll = secondRoll;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	/**
	 * Decreases the bonus by 1
	 */
	public void decreaseBonus() {
		this.bonus--;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}
