import java.util.ArrayList;
import java.util.List;

interface Tower {
    int move();
}

public class SidePegsTower implements Tower {
    private int numOfDisks;

    public SidePegsTower(int numOfDisks) {
        this.numOfDisks = numOfDisks;
    }

    @Override
    public int move() {
        if (numOfDisks <= 0) {
            return 0;
        } else if (numOfDisks == 1) {
            return 2;
        } else if (numOfDisks == 2) {
            return 7;
        } else {
            return 2 * new SidePegsTower(numOfDisks - 1).move() + (1 << (numOfDisks + 1)) - 6;
        }
    }
}
