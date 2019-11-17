package shared.message;

import java.util.ArrayList;

public class ReduceMessage extends Message {

    private static final long serialVersionUID = 1L;
    public String id;
    public ArrayList<String> words;
    public String word;

    @Override
    public String messageType() {
        return "Reduce Message";
    }

    public ReduceMessage(String id, String word, ArrayList<String> words) {
        this.id = id;
        this.words = words;
        this.word = word;
    }
}
