import java.util.List;

public class NeednedCours extends Cours{
    private List<String> tasks;

    public NeednedCours(String name, int number, String tName, List<String> tasks) {
        super(name, number, tName);
        this.tasks = tasks;
    }
}
