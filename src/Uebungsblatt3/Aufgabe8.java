package Uebungsblatt3;

public class Aufgabe8 {
	
	public static void main (String []args) {
		
		// erstellen ein String-Array 'strings' mit einer Länge von 5
		String[] strings = new String[5];
		// Zuweisung der Element an der Position 4 des Arrays den Wert "Hello"
		strings[4] = "Hi"; 
		// Zuweisung des Werts des Elements an der Position 4 des Arrays der Variable s
		String s = strings[4];
		
		// Anwenden  von toLowerCase()-Methode auf null, wird eine NullPointerException ausgelöst. 
		if (s != null) {
		    s = s.toLowerCase();
		}
		/* 
		 * Dieser Code initialisiert das Array strings, weist dem Element an der Position 4 einen Wert zu, 
		 * überprüft dann, ob das Element nicht null ist, 
		 * und wendet die toLowerCase()-Methode darauf an. 
		*/
		System.out.println(s);
}
	
}
