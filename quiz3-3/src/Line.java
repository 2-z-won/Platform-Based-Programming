import java.util.List;

public class Line {
    private List<Content> contents;

    public Line(List<Content> contents) {
        this.contents = contents;
    }

    public void print() {
        for (Content content : contents) {
            content.print();
        }
        System.out.println();
    }
}