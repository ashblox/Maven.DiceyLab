import java.util.HashMap;
import java.util.Map;

public class Bins {

    private int startingSumOfDice;
    private int endingSumOfDice;
    private Map<Integer, Integer> frequencies;

    public Bins(int startingSumOfDice, int endingSumOfDice) {
        this.startingSumOfDice = startingSumOfDice;
        this.endingSumOfDice = endingSumOfDice;
        this.frequencies = new HashMap<Integer, Integer>();
    }

    public void populateBins(Dice dice, int timesRolled) {
        for (int i = 0; i < timesRolled; i++) {
            Integer key = dice.tossAndSum();
            if (frequencies.containsKey(key)) {
                Integer value = frequencies.get(key);
                value ++;
                frequencies.put(key, value);
            } else {
                frequencies.put(key, 1);
            }
        }
    }

    public Integer getBin(int binNumber) {
        Integer contains = null;
        for (Map.Entry<Integer, Integer> entry: frequencies.entrySet()) {
            if (frequencies.containsKey(binNumber)) {
                contains = frequencies.get(binNumber);
            } else {
                System.out.println("Bins do not contain that bin number");
            }
        }
        return contains;
    }

}
