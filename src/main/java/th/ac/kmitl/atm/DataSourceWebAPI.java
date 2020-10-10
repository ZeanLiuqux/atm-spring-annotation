package th.ac.kmitl.atm;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceWebAPI {
    @Override
    public Map<Integer,Customer> readCustomers() {
        Map<Integer,Customer> customers = new HashMap<>();
        customers.put(1, new Customer(1, "ขวัญ", 1234, 1000)) ;
        customers.put(2, new Customer(2, "พลอย", 2345, 2000)) ;
        customers.put(3, new Customer(3, "ฝน", 3456, 3000)) ;
    }
}
