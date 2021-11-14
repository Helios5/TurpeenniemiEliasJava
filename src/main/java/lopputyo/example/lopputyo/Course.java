package lopputyo.example.lopputyo;

import java.util.ArrayList;
import java.util.List;

import lopputyo.example.lopputyo.Student;

public abstract class Course {
    
    private int idCourse;
    protected String courseName;
    protected String teacherName;
    protected List<Student> students;



    public int getIdCourse() {
        return this.idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student){

        if(students.contains(student)){
            return false;
    }else{

        
        students.add(student);
        return true;
    }
}
}