/* 
 * ComputePiClient.java
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

public class ComputePiClient {

	public static void main(String[] args) {
		
		if(System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		
		try {
			String name = "//" + args[0] + "/ComputePi";
			ComputePiRemote computePiRemote = (ComputePiRemote) Naming.lookup(name);
			Analysis analysis = computePiRemote.createStatistics(Integer.parseInt(args[1]));
			
			int g = analysis.getG();
			int v = analysis.getV();
			
			System.out.println("g = " + g);
			System.out.println("v = " + v);
			
			BigDecimal div = new BigDecimal(v).divide(new BigDecimal(g));
			BigDecimal pi = div.multiply(new BigDecimal(4));
			
			System.out.println("Daraus folgt PI = " + pi);
		}
		catch(Exception e) {
			System.err.println("ComputePiClient exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
