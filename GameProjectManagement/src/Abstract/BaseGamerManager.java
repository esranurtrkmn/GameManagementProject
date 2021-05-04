package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public abstract class BaseGamerManager implements GamerService{

	@Override
	public void Save(Gamer gamer) throws NumberFormatException, RemoteException, Exception {
		System.out.println("Gamer saved: "+gamer.getFirstName());
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Gamer updated: "+gamer.getFirstName());
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Gamer deleted: "+gamer.getFirstName());
		
	}

}
