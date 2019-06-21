import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //HashMap map = new HashMap<Integer,Double>();
        Course map = new Course();

        map.getCalificationMap().put(123, 9);
        map.getCalificationMap().put(123, 4.5);
        map.getCalificationMap().put(345, 6);
        map.getCalificationMap().put(456, 7.3);
        System.out.println(map.getCalificationMap());
    }
}
