// Compare Upcasting VS Downcasting
class Car{
    public void CarType(){
        System.out.println("There are so many car types");
    } 
}
class BMW extends Car{
    public void CarFeature(){
        System.out.println("BMW HAS ECO FEATURE");
    }
}

public class UpcastingVsDowncasting {
    public static void main(String[] args) {
        try {
            Car obj1 = new BMW(); // UpCasting
        obj1.CarType();
        if (obj1 instanceof BMW){ // Safe DownCasting
            BMW obj2 = (BMW) obj1;
            obj2.CarFeature();
        }
        else{
            System.out.println("Issue");
        }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error.........");
        }
        }
    }