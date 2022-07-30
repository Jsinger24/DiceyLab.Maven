
import java.util.Random;
public class Dice {

    int numberOfDice;
    Random generator = new Random();
    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }
    public Integer tossAndSum() {
        int sumOfRoll = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sumOfRoll += generator.nextInt(6) + 1;
        }
        return sumOfRoll;
    }
}
