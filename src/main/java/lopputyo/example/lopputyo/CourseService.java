package lopputyo.example.lopputyo;
import java.util.List;


import lopputyo.example.lopputyo.Course;
import lopputyo.example.lopputyo.Student;

public interface CourseService {
    
    List<Student> getStudents();
    
    List<Course> getCourses();

    Student getStudentById(long studentId);

    Course getCourseById(long courseId);

    List<Course> getCoursesOfStudent(long studentId);
    
    boolean addStudentToCourse(long studentId, long courseId); 



}
