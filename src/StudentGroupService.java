import java.util.*;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public void removeStudentByFIO(String firstName, String lastName, String middleName){ //метод по удалению студента
        Iterator<Student> iterator = studentGroup.iterator();//вызов метода итератор
        while (iterator.hasNext()){ //с помощью метода hasNext проверяем существует ли данный студент
            Student student = iterator.next();  // если студент существует, то с помощью итератора будем его доставать
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)){
                iterator.remove(); //удалили студента
            }

        }
    }

    public List<Student> getSortingStudentList() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList); //сортируем наш список
        return studentList;
    }

    public List<Student> getSortingStudentFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studentGroup.createStudent(firstName, lastName, middleName);
    }
}
