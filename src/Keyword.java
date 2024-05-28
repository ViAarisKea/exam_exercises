import java.util.ArrayList;
import java.util.List;

public class Keyword {
    private String word;
    private String definition;
    private List<Keyword> seeAlso;

    public Keyword(String word, String definition){
        this.word = word;
        this.definition = definition;
        seeAlso = new ArrayList<>();
    }

    public boolean matches(String searchWord){
        return word.toLowerCase().contains(searchWord.toLowerCase());
    }

    public void printKeyword(){
        System.out.println(toString());
        for(Keyword keyword : seeAlso){
            System.out.println(keyword.getWord());
        }
    }

    public String toString(){
        return "Word: " + word + "\nDefinition: " + definition;
    }

    public List<Keyword> getSeeAlso(){
        return seeAlso;
    }

    public String getWord() {
        return word;
    }
}
