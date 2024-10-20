public interface Content {
    void print();  // 인터페이스로 선언된 메서드
}

// Content 인터페이스를 구현하는 클래스
class SimpleContent implements Content {
    private char character;
    private int count;

    public SimpleContent(char character, int count) {
        this.character = character;
        this.count = count;
    }

    @Override
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(character);
        }
    }
}
