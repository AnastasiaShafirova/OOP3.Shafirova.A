public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();


    @Override
    public void create(String firstName, String lastName, String middleName) {

    }
}
