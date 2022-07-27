public class Dice {
    
    public int numOfDice = 2;
    int sum = 0;
    private String currentRoll2;

    public Integer rollDice(int numOfDice, int sum){
        for(int i = 0; i < numOfDice; i++){
            int currentRoll = (int) ((Math.random() * 6) + 1);
            System.out.println("Roll is: " + currentRoll);
            System.out.println("Roll is: " + currentRoll2);
        }
        return sum;

    }


}
