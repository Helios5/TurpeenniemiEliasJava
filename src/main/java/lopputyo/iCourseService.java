package lopputyo;

import java.util.List;
import java.util.ArrayList;
import lopputyo.example.lopputyo.Student;
import lopputyo.example.lopputyo.Course;
import lopputyo.example.lopputyo.CourseService;



@RestController
public class iCourseService implements CourseService {
    List<Student> students = new ArrayList<Student>();
	List<Course> courses = new ArrayList<Course>();


    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }
    @Override
    public Course getCourseById(long courseId) {
        for (Course course : courses) {
            if(course.getIdCourse()==courseId)
                return course;
        }
        return null;
    }
    @Override
    public Student getStudentById(long studentId) {
        for (Student student : students) {
            if(student.getId() == studentId){
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Course> getCoursesOfStudent(long studentId) {
        Student st = getStudentById(studentId);
        List<Course> attendedCourses = new ArrayList<Course>();
        for (Course course : courses) {
            if(course.getStudents().contains(st))
                attendedCourses.add(course);
        }
        return attendedCourses;
    }

    @Override 
    public boolean addStudentToCourse(long studentId, long courseId) {
        Student st = getStudentById(studentId);
        for (Course course : courses) {
            if(course.getIdCourse()==courseId)
                return course.addStudent(st);
        }
        return false;
    }



}
