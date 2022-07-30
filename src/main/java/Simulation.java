public class Simulation {

    int dice;
    int tosses;
    private StringBuilder results;
    public Simulation(int numberOfDice, int numberOfTosses) {
        this.dice = numberOfDice;
        this.tosses = numberOfTosses;
        this.results = new StringBuilder();
    }
    public int getNumberOfDice() {
        return dice;
    }
    public void setDice(int numberOfDice) {
        this.dice = numberOfDice;
    }
    public int getNumberOfTosses() {
        return tosses;
    }
    public void setTosses(int numberOfTosses) {
        this.tosses = numberOfTosses;
    }
    public StringBuilder getResults() {
        return results;
    }
    public void runSimulation() {
        Dice dice = new Dice(getNumberOfDice());
        Bins bins = new Bins(6*getNumberOfDice());

        for (int i = 1; i <= this.tosses; i++) {
            bins.addToBin(dice.tossAndSum());
        }
        parseResults(bins);
    }
    public void clearResults() {
        results = new StringBuilder();
    }
    public void parseResults(Bins bins) {
        this.clearResults();
        for (int i = getNumberOfDice(); i<= getNumberOfDice() * 6; i++) {
            results.append(String.format("%2d :%9d: %4.2f %s\n", i, bins.getBin(i), (1.0 * bins.getBin(i)/getNumberOfTosses()),
                    getStarsAsPercentage(1.0 * bins.getBin(i)/getNumberOfTosses())));
        }
    }
    public String getStarsAsPercentage(double percentage) {
        StringBuilder stars = new StringBuilder();
        int numStars = (int)(100*percentage);
        for (int i = 1; i <= numStars; i++) stars.append("*");
        return String.valueOf(stars);
    }
    public void printResults() {
        System.out.println(results);
    }

}
