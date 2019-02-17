import java.sql.SQLOutput;

public class Simulation {

    public static void main(String[] args) {
        Dice dice = new Dice(1);
        System.out.println(dice.tossAndSum());
    }

}
