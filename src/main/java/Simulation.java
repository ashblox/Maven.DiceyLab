public class Simulation {

    private int numberOfDies;
    private int numberOfTosses;
    private Bins bins;
    private Dice dice;
    private int startingNumberOfBins;
    private int endingNumberOfBins;

    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.startingNumberOfBins = 1 * numberOfDies;
        this.endingNumberOfBins = 6 * numberOfDies;
    }

    public void run() {
        this.dice = new Dice(numberOfDies);
        this.bins = new Bins(startingNumberOfBins, endingNumberOfBins);
        bins.populateBins(dice, numberOfTosses);
    }

    public void printResults() {
        String results = "";
        for (int i = startingNumberOfBins; i <= endingNumberOfBins; i++) {
            results += histo(i);
        }
        results.trim();
        System.out.print(results);
    }

    public static void main(String[] args) {
        Simulation test = new Simulation(2, 1000000);
        test.run();
        test.printResults();
    }
    public String histo (int binNumber) {
        float percentage = (float)bins.getBin(binNumber)/(float)numberOfTosses;
        String result = String.format("%3d : %8d: %5.2f ", binNumber, bins.getBin(binNumber), percentage);
        for (int i = 0; i < percentage*100; i++) {
            result += "*";
        }
        result += "\n";
        return result;
    }


//    public static void main(String[] args) {
//        Dice dice = new Dice(2);
//        Bins bins = new Bins(2, 12);
//        bins.populateBins(dice, 100);
//        System.out.println(bins.getBin(10));
//    }

}
