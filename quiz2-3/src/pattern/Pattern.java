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

    public Line(int n, int lineNum) {
        int spaceNum = lineNum-1;
        stars = new Characters('x', n-lineNum+1);
        spaces = new Characters('-', spaceNum);
    }

    public void print() {
        stars.print();
        spaces.print();
        System.out.println();
    }
}

public class Pattern {
    private final Line[] lines;

    public Pattern(int n) {
        lines = new Line[n];
        for (int lineNum = 1; lineNum <= n; lineNum++) {
            lines[lineNum - 1] = new Line(n, lineNum);
        }
    }

    public void print() {
        for (Line line : lines) {
            line.print();
        }
    }
}
