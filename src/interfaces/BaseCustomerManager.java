package interfaces;

import entities.Customer;

public class BaseCustomerManager  implements CustomerService{

    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved in DB");
    }
}
