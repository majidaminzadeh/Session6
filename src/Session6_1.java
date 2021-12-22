import com.tosan.polymorphism.Deposit;
import com.tosan.polymorphism.JariDeposit;
import com.tosan.polymorphism.PasandazDeposit;

public class Session6_1 {
    public static void main(String[] args) {
        Deposit deposit1; // declare
        deposit1 = new JariDeposit(); // instantiate permitted
        deposit1.defray(10);
        //deposit1 = new PasandazDeposit(); // instantiate permitted

        //deposit1 = new Deposit(); // instantiate not permitted
    }
}
