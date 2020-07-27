package gamestate;

public class ColourStack {

    private int stackCount;


    public static ColourStack createStack() {
        return new ColourStack(0);
    }

    private ColourStack(int stackCount) {
        this.stackCount = stackCount;
    }

    public void playCardOnStack() {
        stackCount++;
    }

    public int getStackCount() {
        return stackCount;
    }

    public boolean canNumberBePlayed(int number) {
        return number == stackCount + 1;
    }

    @Override
    public String toString() {
        return "ColourStack{" +
                "stackCount=" + stackCount +
                '}';
    }
}
