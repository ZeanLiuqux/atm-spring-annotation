package th.ac.kmitl.atm;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@Component
public class DataSourceFile implements DataSource {

    private String filename;

    /**
     * @param filename the name of the customer file
     */
    public DataSourceFile(String filename) {
        this.filename = filename;
    }

    /**
     * Reads the customer numbers and pins
     * and initializes the bank accounts.
     */

    public Map<Integer,Customer> readCustomers() {

        Map<Integer,Customer> customers = new HashMap<>();
        customers.put(1, new Customer(1, "Kwan", 1234, 1000)) ;
        customers.put(2, new Customer(2, "ploy", 2345, 2000)) ;
        customers.put(3, new Customer(3, "Fon", 3456, 3000)) ;

        return customers;
    }
}
