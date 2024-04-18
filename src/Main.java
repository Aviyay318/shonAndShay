import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        }
    public List<Student> maxGrade(Student [] students,int coursNum){
       int max = 0;
        for (int i = 0; i < students.length; i++) {
           if (students[i].isExist(coursNum)){
               if (students[i].isBigger(max,coursNum)){
                   max=students[i].getGrades().get(coursNum);
               }
           }
        }
        List<Student> studentsWithMaxGrades= new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].isExist(coursNum)&&students[i].isEquals(max,coursNum)){
               studentsWithMaxGrades.add(students[i]);
            }
            }
        return studentsWithMaxGrades;
    }

    public static List<Lectherer> lecthererOfCoures
            (Lectherer [] lectherers,int couresNum){
        List<Lectherer> lecthererOfCoures = new ArrayList<>();
        for (int i=0;i<lectherers.length;i++ ){
            if (lectherers[i].isTeching(couresNum)){
                lecthererOfCoures.add(lectherers[i]);
            }
        }
        return lecthererOfCoures;
    }
public static void addToListByChar
        (List<Person> personList , char charToCheck, Person person){
       if (person.containsChar(charToCheck)){
           personList.add(person);
       }
}

}