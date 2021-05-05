import adapters.MernisServiceAdapter;
import classes.CustomerCheckManager;
import classes.NeroCustomerManager;
import classes.StarbucksCustomerManager;
import entities.Customer;
import interfaces.BaseCustomerManager;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(1,"ÖZKAN","YILDIRIM", new Date (1988,8,9),
                "*******");

        System.out.println(customer.getFirstName() + customer.getLastName() + customer.getDateOfBirth().getYear());

        BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
        neroCustomerManager.save(customer);


        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        starbucksCustomerManager.save(customer);


    }
    }

