import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();//созлали экземпляр сервиса

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName); //реализовали наш метод, передав в него все данные

    }
    public List<Student> getSortingStudentList() {
        studentGroupService.getSortingStudentList();
        return List.of();
    }

    public List<Student> getSortingStudentFIO() {
        return studentGroupService.getSortingStudentFIO();
    }
    private PotocService potocService = new PotocService();
    private  List<Potoc> potocList;

    public Controller(List<Potoc> potocs) {
        this.potocList = potocList;

    }

    public void sortPotocs() {
        potocService.sortPotocs(potocList);
    }
}
