import java.math.*;
import java.rmi.*;
import java.rmi.server.*;

/**
 * RMI Serverobjekt
 */
public class ComputePiServer extends  UnicastRemoteObject implements ComputePiRemote{
    protected ComputePiServer() throws RemoteException{
        super(); //alternativ TCP/IP-Portnummer des Serverobjekts angeben
    }
    public BigDecimal computePi(int precision) throws RemoteException{
        return Pi.computePi(precision);
    }
}
