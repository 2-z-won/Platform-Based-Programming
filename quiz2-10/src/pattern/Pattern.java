package pattern;

class Characters {
    private final char character;
    private final int printNum;

    public Characters(char character, int printNum) {
        this.character = character;
        this.printNum = printNum;
    }

    public void print() {
        for (int i = 0; i < printNum; i++) {
            System.out.print(character);
        }
    }
}

class Line {
    private final Characters stars;
    private final Characters spaces;

    public Line(int starsNum, int spaceNum) {
        stars = new Characters('x', starsNum);
        spaces = new Characters('-', spaceNum);
    }

    public void print() {
        spaces.print();
        stars.print();
        System.out.println();
    }
}

public class Pattern {
    private final Line[] lines;

    public Pattern(int n) {
        lines = new Line[2*n - 1];
        for (int lineNum = 1; lineNum <= n; lineNum++) {
            int starsNum = lineNum;
            int spaceNum = n - lineNum;
            lines[lineNum - 1] = new Line(starsNum, spaceNum);
        }
        for (int lineNum = n+1; lineNum<= 2*n-1; lineNum++){
            int starsNum = 2*n-lineNum;
            int spaceNum = lineNum-n;
            lines[lineNum - 1] = new Line(starsNum, spaceNum);
        }
    }

    public void print() {
        for (Line line : lines) {
            line.print();
        }
    }
}
