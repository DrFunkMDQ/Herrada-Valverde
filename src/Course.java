import java.util.HashMap;
import java.util.Map;

public class Course {
    //ATTRIBUTES
    private Map <Integer, Double>calificationMap;
    //CONSTRUCTOR

    public Course() {
        setCalificationMap();
    }


    //GETTERS && SETTERS

    public Map getCalificationMap() {
        return calificationMap;
    }

    public void setCalificationMap() {
        this.calificationMap = new HashMap<Integer, Double>();
    }

    //METHODS

    //SE DEBE REALIZAR EL METODO Double calculateGrades(); --> Chequea la cantidad e preguntas correctas e incorrectas y retrna una nota

}
