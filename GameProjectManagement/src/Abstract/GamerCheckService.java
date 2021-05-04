package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerCheckService {
	
	boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;

}
