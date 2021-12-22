import com.tosan.example.Car;
import com.tosan.example.Vehicle;

public class Session6 {
    public static void main(String[] args) {
        // com.tosan.example.Car concept -> Abstract Class
       // String name = new String("name");
        //String name2 = new String("name");
        Car obj;
        obj = new Car();


        if(obj instanceof Car){
            System.out.println("car object is type of com.tosan.example.Car class");
        }
        if(obj instanceof Vehicle){
            System.out.println("car object is type of com.tosan.example.Vehicle class");
        }
        if(obj instanceof Object){
            System.out.println("car object is type of Object class");
        }
    }
}
