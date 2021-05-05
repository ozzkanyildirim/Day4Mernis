package adapters;

import entities.Customer;
import interfaces.CustomerCheckService;
import mernis.BGEKPSPublicSoap;



import java.rmi.RemoteException;


public class MernisServiceAdapter implements CustomerCheckService {


    @Override
    public boolean CheckPerson(Customer customer) throws Exception {
        BGEKPSPublicSoap soapClient = new BGEKPSPublicSoap();
        boolean result = false;
        try {
            result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (RemoteException e ) {
            e.printStackTrace();
        }
        return  result;
    }
}
