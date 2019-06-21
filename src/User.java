import java.util.List;

public abstract class User {
    //ATTRIBUTES
    private int id;
    private static int contId = 1;
    private int dni;
    private String name;
    private String surName;
    private String password;
    private List<Course> courseList;
    //CONSTRUCTOR

    public User(int id, int dni, String name, String surName, String password, List<Course> courseList) {
        setId();
        setDni(dni);
        setName(name);
        setPassword(password);
        setSurName(surName);
        setCourseList(courseList);
    }

    //GETTERS && SETTERS

    public int getId() {
        return id;
    }

    public void setId() {////////////////////////////////////////////////////////////////////////////////////////
        this.id = contId++;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Object> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    //METHODS


    @java.lang.Override
    public java.lang.String toString() {
        return  "Id = " + id +
                "\nDNI = " + dni +
                "\nName = " + name +
                "\nSurname = " + surName +
                "\nPassword = " + password +
                "\nCourseList = " + courseList;
    }
}
