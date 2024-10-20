import java.util.ArrayList;
import java.util.List;

public class Pr10991 implements LineFactory{
    int input;

    public Pr10991(int input) {
        this.input = input;
    }

    @Override
    public int numOfLines(){
        return input;
    }

    @Override
    public Line create(int lineNum) {
        int starNum = lineNum;
        int spaceNum = input - lineNum;

        List<Characters> characterList = new ArrayList<>();
        characterList.add(new Characters('-', spaceNum));

        for(int i = 0; i < starNum; i++){
            characterList.add(new Characters('x', 1));
            if (i < starNum - 1){
                characterList.add(new Characters('-', 1));
            }
        }
        characterList.add(new Characters('-', spaceNum));
        return new Line(characterList);
    }
}
