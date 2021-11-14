import java.util.List;

import lopputyo.example.lopputyo.Course;
import lopputyo.example.lopputyo.Student;

public class LocalCourse extends Course {

    private String classRoom;
    private int maxCourseSize = 25;

    public LocalCourse(String courseName, String teacherName, 
    List<Student> students, String room, String classRoom, int maxCourseSize) {

        this.courseName = courseName;
        this.teacherName = teacherName;
        this.students = students;
        this.classRoom = classRoom;
        this.maxCourseSize = maxCourseSize;
    }


    public String getClassRoom() {
        return this.classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getMaxCourseSize() {
        return this.maxCourseSize;
    }

    public void setMaxCourseSize(int maxCourseSize) {
        this.maxCourseSize = maxCourseSize;
    }

    @Override
    public boolean addStudent(Student student){

        if(students.size() < maxCourseSize){
            return super.addStudent(student);

        }else{
            return false;
    }
}

@Override
public String toString(){
    return courseName + "  " + teacherName + "  " + classRoom;
}

}


