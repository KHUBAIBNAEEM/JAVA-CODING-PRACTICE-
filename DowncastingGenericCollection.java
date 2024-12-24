import java.util.ArrayList;
import java.util.List;

public class DowncastingGenericCollection {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add(new String("Hello"));
        objects.add(new Integer(10));

        for (Object obj : objects) {
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println(str); 
            } else if (obj instanceof Integer) {
                int num = (Integer) obj;
                System.out.println(num); 
            } else {
                System.out.println("Unknown object type."); 
            }
        }
    }
}