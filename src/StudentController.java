import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentGroupService studentGroupService = new StudentGroupService();//созлали экземпляр сервиса

    private final StudentVU studentVU = new StudentVU();
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName); //реализовали наш метод, передав в него все данные

    }
    public List<Student> getSortingStudentList() {
        List<Student> studentList = studentGroupService.getSortingStudentList();
        studentVU.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortingStudentFIO() {
        List<Student> studentList = studentGroupService.getSortingStudentFIO();
        studentVU.sendOnConsole(studentList);
        return studentList;
    }
    private final PotocService potocService = new PotocService();

    private  List<Potoc> potocList;

    public StudentController(List<Potoc> potocs) {
        this.potocList = potocList;

    }

    public void sortPotocs() {
        potocService.sortPotocs(potocList);
    }


    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
