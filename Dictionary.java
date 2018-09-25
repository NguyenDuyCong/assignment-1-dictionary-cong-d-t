import java.util.ArrayList;

public class Dictionary {

    public Dictionary() {

    }

    private ArrayList<Word> listWord = new ArrayList<Word>();

    public void addWord(Word word) {
        this.listWord.add(word);
    }
}
