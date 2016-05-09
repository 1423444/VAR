/* 
 * ComputePiRemote.java
 * 
 * Autoren: Johannes Heiler, Lucas Kneis, Tobias Juenemann
 *          
 * Diese Datei gehoert zur Pflichtübung 2, 
 * Hochschule Mannheim, VAR, SS2016
 * 
 * Letztes Update: 09. Mai 2016
 */
import java.math.*;
import java.rmi.*;

public interface ComputePiRemote extends Remote {
	
	public Analysis createStatistics(int count) throws RemoteException;
}
