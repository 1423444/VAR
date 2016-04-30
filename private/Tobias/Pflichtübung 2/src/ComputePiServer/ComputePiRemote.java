package ComputePiServer;

import java.math.*;			// Contains BigDecimal class
import java.rmi.*;

public interface ComputePiRemote {
	
	BigDecimal computePi(int precision) throws RemoteException;

}
