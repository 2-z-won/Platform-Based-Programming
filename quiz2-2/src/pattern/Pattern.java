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
        int spaceNum = n - lineNum;
        stars = new Characters('x', lineNum);
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
