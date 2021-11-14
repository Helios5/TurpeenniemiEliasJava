package lopputyo.example.lopputyo;

import java.io.FileNotFoundException;
import java.util.List;

import lopputyo.example.lopputyo.Student;
import lopputyo.example.lopputyo.Course;


public interface CourseFileService {

    List<Student> readStudentsFromfile(String filepath) throws FileNotFoundException;

    List<Course> readCourseFromfile(String filepath) throws FileNotFoundException;
    
}
