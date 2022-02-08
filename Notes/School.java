
/**
 * Write a description of class School here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class School
{
    ArrayList<Student> listOfStudents;
    int nextIDnum = 1;
    int ID;
    public School(int school1ID){
        listOfStudents = new ArrayList<Student>();
        ID=school1ID;
    }
    public void addStudent(Student student){
        listOfStudents.add(student);
    }
    public void removeFirstStudent(){
        listOfStudents.remove(0);
    }
    /*
     * Removes the student from the list
     */
    public void removeStudent(Student student){
        //Find the index of the student to remove
        int index = -1;
        for(int i = 0; i < listOfStudents.size(); i++){
            if(student.equals(listOfStudents.get(i))){
                index = i;
            }
        }
        //Remove them
        if (index>= 0){
            listOfStudents.remove(index);
        }
    }
    public void testAddStudent(int numOfStudents){
        for (int i = 0; i < numOfStudents; i++){
            addStudent(new Student("Test", nextIDnum));
            nextIDnum++;
        }
    }
    public ArrayList<Student> getStudents(){
        return listOfStudents;
    }
    public int getID(){
        return ID;
    }
    public void updateStudent(int index, Student student){
        listOfStudents.set(index, student); 
        //Changes or overwrites the index to be the new student
        
    }
}
    

