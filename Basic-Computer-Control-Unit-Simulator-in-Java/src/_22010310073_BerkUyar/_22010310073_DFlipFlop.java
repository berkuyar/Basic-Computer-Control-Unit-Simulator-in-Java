package _22010310073_BerkUyar;

public class _22010310073_DFlipFlop {
    private boolean state;

    public _22010310073_DFlipFlop() {
        this.state = false;
    }

    public boolean getState() {
        return state;
    }

    public void setInput(boolean input) {
        this.state = input;
    }
}
