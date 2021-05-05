package interfaces;

import entities.Customer;
import org.apache.axis.AxisFault;

import java.rmi.RemoteException;

public interface CustomerCheckService {
    boolean CheckPerson(Customer customer) throws Exception;
}
