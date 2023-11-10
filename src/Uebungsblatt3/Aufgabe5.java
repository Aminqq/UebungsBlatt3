package Uebungsblatt3;

public class Aufgabe5 {
	
	class Car {
		
		int age = 10;
		String model = "Dukemobile";
		String getDescription() {
			//select one of the options to insert here
			return model + ": " + age + " years old";
			//model  ": " + age + " years old"; Fehler wegen der Sysntext
			//System.out.println(model + ": " + age + " years old"); nicht erreichbarer Code
			// return age; es kann nicht von INT nach String konvertieren

		}
	}

}
