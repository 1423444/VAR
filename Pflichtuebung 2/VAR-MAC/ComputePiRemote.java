import java.math.*;//Big Decimal
import java.rmi.*;

/**
 * RMI Remote Interface
 */
public interface ComputePiRemote extends Remote{
    BigDecimal computePi(int precisino) throws RemoteException;
}
