package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
        
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
		boolean result=client.TCKimlikNoDogrula(
				
				gamer.getNationalityId(),
				gamer.getFirstName().toUpperCase(), 
				gamer.getLastName().toUpperCase(), 
				gamer.getDateOfBirth()
				
				);
		
		
		return result;
	}

}
