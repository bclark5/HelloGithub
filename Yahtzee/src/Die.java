import java.util.ArrayList;

//class declaration
public class Die implements Comparable {
    private int faceValue;
    private int numFaces;

    public Die(int numFaces) {
        this.faceValue = 0;
        rollDie();
        this.numFaces = numFaces;
    }

    public void rollDie()
    {
        faceValue = (int)(Math.random()*numFaces) + 1;
    }

    @Override
    public int compareTo(Object o) {
        Die rhs = (Die)o;
        if(this.getFaceValue()== rhs.getFaceValue()){
            return 0;
        }
        else if(this.getFaceValue() < rhs.getFaceValue()){
            return -1;

        }
        else{
            return 1;
        }
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int getNumFaces() {
        return numFaces;
    }
}
