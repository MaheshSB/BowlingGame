/* main Class to kick off the bowling game */

import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String args[]) {

		BowlingGame game = new BowlingGame();

		System.out.println("Score in the beginning is: " +game.getScore());
		System.out.println("Is the Game Finished :" + game.isFinished());
		int lastPinValue=0;
		for (int i = 0; i < 12; i++) {
			game.roll(10);
			/*int pins = ThreadLocalRandom.current().nextInt(0, 10); //generate a pin value randomly within a range of 0-10
			if(pins + lastPinValue > 10) {
				pins = pins % 10;
			}
			System.out.println("Going to roll with a pin value of: "+pins);
			game.roll(10);
			lastPinValue =pins;*/
		}

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Game was interrupted:" + e.getMessage());
		}
		
		System.out.println("Is the Game Finished :" + game.isFinished());

		System.out.println("Final Score is:" +game.getScore());

		// printing the Scores
		for (int i = 0; i < game.frames.length; i++) {

			System.out.print("Attempt Number"+ i + " - ");
			System.out.print("[" + game.frames[i].getFirstRoll() + " , ");

			if (game.frames[i].isSpare())
				System.out.print("\\");
			else if (game.frames[i].isStrike())
				System.out.print("X");
			else
				System.out.print(game.frames[i].getSecondRoll());

			System.out.print("] , Live Score: " + game.frames[i].getTemp());
			System.out.print(", Points: " + game.frames[i].getPoints());
			System.out.println();
		}
	}
}
