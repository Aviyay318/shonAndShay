import java.util.Map;

public class Student extends Person{
    private Map<Integer,Integer> grades ;

    public Student(String name, String id, Map<Integer, Integer> grades) {
        super(name, id);
        this.grades = grades;
    }

    public Map<Integer, Integer> getGrades() {
        return grades;
    }
    public boolean isExist(int coursNum){
        return this.grades.containsKey(coursNum);
    }
    public boolean isBigger(int max,int coursNum){
       return this.grades.get(coursNum)>max;
    }
    public boolean isEquals(int max,int coursNum){
        return max==this.grades.get(coursNum);
    }

}
