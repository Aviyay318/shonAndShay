import javax.sound.sampled.Line;
import java.util.List;

public class Lectherer extends Person{
    private List<Cours> coursList;

    public Lectherer(String name, String id, List<Cours> coursList) {
        super(name, id);
        this.coursList = coursList;
    }

    public boolean isTeching(int coursNum){
        boolean isExist = false;
        for (int i = 0; i < this.coursList.size(); i++) {
            if (this.coursList.get(i).getNumber()==coursNum){
                isExist= true;
                break;
            }
        }
        return isExist;
    }
}
