package lopputyo.example.lopputyo;

public class Student {
    
    private static int idCounter = 0;

     private int id;
     private String firstName;
     private String lastName;


    public Student(int id, String firstName, String lastName){
    this.id = idCounter++;
    this.firstName = firstName;
    this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString(){

        return "Students firstname is " + this.firstName + "Students lastname is " + this.lastName;
    
    }
}
