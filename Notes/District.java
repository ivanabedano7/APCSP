
/**
 * Write a description of class District here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class District
{
    ArrayList<School> listOfSchools;
    int nextIDnum = 1;
    public District(){
        listOfSchools = new ArrayList<School>();
    }
    public void addSchools(School school){
        listOfSchools.add(school);
    }
    public void removeSchools(School school){
        int index = -1;
        for(int i = 0 ; i < listOfSchools.size(); i++){
            if(school.equals(listOfSchools.get(i))){
                index = i;
            }
        }
        //Remove them
        if (index>= 0){
            listOfSchools.remove(index);
        }
        }
    public void testAddSchools(int numOfSchools){
        for (int i = 0; i < numOfSchools; i++){
            addSchools(new School(nextIDnum));
            nextIDnum++;
        }
        for (School school: listOfSchools){
            school.testAddStudent(10);
        }
    }
    /*Goal: Create a mehtod that prints out EVERY student's name and ID number
     * 
     * <Student's name> : SchoolID : StudentID
     * Sample:
     * "Test" : 1 : 1
     */
    public void printAllStudents(){
        for(School school: listOfSchools){
            for(Student student: school.getStudents()){
                System.out.println(student.getName() + ": " + school.getID() + 
                ": " + student.getID ());
            }
        }
    }
    public void addFirstSchool(School school){
        listOfSchools.add(0, school); //Adds it to index 0.
    }
}

