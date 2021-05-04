package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisService.RGPKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        RGPKPSPublicSoap soapClient=new RGPKPSPublicSoap();
        try {
            return soapClient.TCKimlikNoDogrula(Long.valueOf(customer.nationalityId),customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),customer.dateOfBirth.getYear());
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
