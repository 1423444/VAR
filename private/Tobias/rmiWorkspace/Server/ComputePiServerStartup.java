/* 
 * ComputePiServerStartup.java
 * 
 * Autoren: Johannes Heiler, Lucas Kneis, Tobias Juenemann
 *          
 * Diese Datei gehoert zur Pflichtübung 2, 
 * Hochschule Mannheim, VAR, SS2016
 * 
 * Letztes Update: 09. Mai 2016
 */
import java.rmi.*;
import java.rmi.registry.*;

public class ComputePiServerStartup {
	
	public static void main(String[] args) {
		
		if(System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		
		String name = "//" + args[0] + "/ComputePi";
		try {
			ComputePiServer computePiServer = new ComputePiServer();
			Naming.rebind(name, computePiServer);
			System.out.println("ComputePiServer (re)bound");
		}
		catch(Exception e) {
			System.err.println("ComputePiServer exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
