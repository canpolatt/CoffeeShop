import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Engin","Demiroğ", LocalDate.of(1985,1,6),"28861499108"));

    }
}
