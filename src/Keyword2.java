import java.util.ArrayList;
import java.util.List;

public class Keyword2 {

    private String name;
    private String description;
    private List<Keyword2> seeAlso;

    public Keyword2(String name, String description){
        this.name = name;
        this.description = description;
        seeAlso = new ArrayList<>();
    }


    public void addSeeAlso(Keyword2 keyword2){
        seeAlso.add(keyword2);
    }

    public void printKeyword(){
        System.out.println(this);
        if(!seeAlso.isEmpty()){
            System.out.println("See also:");
            for(Keyword2 keyword2: seeAlso){
                System.out.println(keyword2.name);
            }
        }

    }

    public String toString(){
        return "Name: " + name + "\nDescription: " + description;
    }
}
