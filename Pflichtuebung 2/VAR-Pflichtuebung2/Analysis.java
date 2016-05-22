/* 
 * Analysis.java
 * 
 * Autoren: Johannes Heiler, Lucas Kneis, Tobias Juenemann
 *          
 * Diese Datei gehoert zur Pflichtübung 2, 
 * Hochschule Mannheim, VAR, SS2016
 * 
 * Letztes Update: 10. Mai 2016
 */
import java.io.Serializable;

@SuppressWarnings("serial")
public class Analysis implements Serializable {

	private int g;
	private int v;
	
	public Analysis(int g, int v) {
		this.g = g;
		this.v = v;
	}
	
	public int getG() {
		return this.g;
	}
	
	public int getV() {
		return this.v;
	}
}