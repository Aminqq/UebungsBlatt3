package Uebungsblatt3;

public class Aufgabe7 {

	static  class Robot {
		 String completeName(String firtsName, String lastName) {
			 //beide Parmater mit Leerzeichen verknüpfen
			return firtsName + " " + lastName;
		}
	}
	
	static class Story {
		public static void main(String args[]) {
		Robot robin = new Robot();
		System.out.println("Robins Name ist " + robin.completeName("Robin",  "Suchroboter"));
		}
		}

}


