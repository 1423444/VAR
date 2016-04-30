package ComputePiServer;

import java.math.*;
import java.rmi.*;
import java.rmi.server.*;

@SuppressWarnings("serial")
public class ComputePiServer extends UnicastRemoteObject implements ComputePiRemote {

	protected ComputePiServer() throws RemoteException {
		super(); // oder alternativ TCP/IP-Portnummer des Server-Objekts vorgeben
	}

	@Override
	public BigDecimal computePi(int precision) throws RemoteException {
		
		//return PI.computePi(precision);
		return new BigDecimal( "1.0" );
		
	}
	
}
