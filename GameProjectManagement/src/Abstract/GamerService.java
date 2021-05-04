package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerService {

	void Save(Gamer gamer) throws NumberFormatException, RemoteException, Exception;
	void Update(Gamer gamer);
	void Delete(Gamer gamer);
}
