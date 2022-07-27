public class Simulation {

    private static int numOfDice = 2;
    private static int numOfTosses = 1000000;
    private static double percentage;
    private static double stars;

    public static void main(String args) {
        Dice dice = new Dice();
        Bins numOfBin = new Bins();
        int sum = 0;

        for (int i = 0; i < numOfTosses; i++) {
            sum = dice.rollDice(numOfDice, 0);
            ++numOfBin.bin[sum];
        }

        for (int i = 2; i < 13; i++) {
            percentage = ((numOfBin.bin[i]) / numOfTosses);
            stars = (((double) numOfBin.bin[i]) / numOfTosses) * 100;
            System.out.println(numOfBin.bin[i]);
            System.out.println("Bin " + i + ":\t" + numOfBin.bin[i] + ":\t" + percentage);
            System.out.println("Bin " + i + ":\t" + numOfBin.bin[i] + ":\t" + percentage);
            System.out.printf("%2d :\t%6d:\t%.2f ", i, numOfBin.bin[i], (double) numOfBin.bin[i] / numOfTosses);
            System.out.println((((double) numOfBin.bin[i]) / numOfTosses)*100);
            System.out.println((int)stars);

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println(" \n");
        }
    }

}
