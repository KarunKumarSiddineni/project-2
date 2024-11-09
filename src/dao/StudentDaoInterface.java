package dao;
import model.Student;

public interface StudentDaoInterface {
    public boolean insertStudent(Student s);
    public boolean delete(int roll);
    public void showAllStudent();
    public boolean showStudentById(int roll);
}
