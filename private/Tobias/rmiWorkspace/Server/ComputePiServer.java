/* 
 * ComputePiServer.java
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
import java.rmi.server.*;

@SuppressWarnings("serial")
public class ComputePiServer extends UnicastRemoteObject implements ComputePiRemote {

	protected ComputePiServer() throws RemoteException {
		super(); // oder alternativ TCP/IP-Portnummer des Server-Objekts vorgeben
	}

	@Override
	public Analysis createStatistics(int count) throws RemoteException {
		int g = count;
		int v = 0;
		
		for (int i = 0; i < g; i++) {	
			double x = Math.random();
			double y = Math.random();
			if(Math.hypot(x, y) <= 1.0) {
				v = v + 1;
			}
		}
		
		return new Analysis(g, v);
	}
}
