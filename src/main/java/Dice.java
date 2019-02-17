import java.util.ArrayList;

public class Dice {

    private int numberOfDies;

    public Dice(int numberOfDies) {
        this.numberOfDies = numberOfDies;
    }

    public int tossAndSum(){
        int sum = 0;
        for (int i = 0; i < numberOfDies; i++) {
            sum += (int)(Math.random()*6) + 1;
        }
        return sum;
    }

    public int getNumberOfDies() {
        return this.numberOfDies;
    }

    public void setNumberofDies(int numberOfDies) {
        this.numberOfDies = numberOfDies;
    }

    public ArrayList<Integer> getValuesOfDice() {
        ArrayList<Integer> valuesOfDice = new ArrayList<Integer>();
        for (int i = 0; i < numberOfDies; i++) {
            int value = (int)(Math.random()*6) + 1;
            valuesOfDice.add(value);
        }
        return valuesOfDice;
    }
}


