import java.util.Scanner;
import java.util.Random;
class RoboThree {
  public static void main(String[] args) {

    int compChoice = getRandomNumberInRange(1, 3);

    System.out.println(compChoice);

  }
  private static int getRandomNumberInRange(int max, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
