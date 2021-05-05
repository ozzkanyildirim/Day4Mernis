package classes;

import entities.Customer;
import interfaces.BaseCustomerManager;
import interfaces.CustomerCheckService;

public class NeroCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;

    public NeroCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.CheckPerson(customer)) {
            System.out.println("Validation successful.++");
            super.save(customer);
        }else {
            System.out.println("Not a valid person.");
        }

    }

}
