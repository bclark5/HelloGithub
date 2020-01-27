import java.util.ArrayList;
import java.util.Collections;

public class Hand {
    private ArrayList<Die> dice;



    public Hand() {
        dice = new ArrayList<Die>();
    }

    public void placeholder() {
        for (int i = 0; i < dice.size(); i++) {
            if (choice == 'y')
                dice.get(i).rollDie();
        }
    }

    public void sortHand() {
        Collections.sort(dice);
    }
    public int totalAllDice(){
        int total=0;
        for(int i=0; i<dice.size(); i++) {
            total += dice.get(i).getFaceValue();
        }

        return total;

    }

}
