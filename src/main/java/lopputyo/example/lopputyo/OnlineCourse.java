package lopputyo.example.lopputyo;


import java.util.List;

import lopputyo.example.lopputyo.Student;

public class OnlineCourse extends Course {

    private String courseAddress;


    public OnlineCourse(String courseName, String teacherName, List<Student> students, String courseAddress){
        this.courseAddress = courseAddress;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.students = students;

    }

    public String getSiteAdress() {
        return this.courseAddress;
    }

    public void setSiteAdress(String courseAddress) {
        this.courseAddress = courseAddress;
    }

    @Override
    public String toString(){
        return courseName + " " +teacherName + " " + courseAddress;
    }
}

