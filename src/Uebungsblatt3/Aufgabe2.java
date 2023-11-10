package Uebungsblatt3;


public class Aufgabe2 {
	
	    public static void main(String[] args) {
	        // Erzeugung eines Roboters mit dem Namen robin und Alter 1
	        Robot robin = new Robot(1);

	        // Aufruf der Methode sayAge() auf dem robin-Objekt
	        robin.sayAge();
	        
	      
	    }
	    
} 

class Story2 {
	
	String robin;
}

class Robot {
	
    private int age; // Attribut zur Speicherung des Alters

    // Konstruktor, um das Alter beim Erstellen eines Roboters festzulegen
    public Robot(int age) {
        this.age = age;
    }

    // Methode zur Ausgabe des Alters
      void sayAge() {
        System.out.println("Ich bin " + age + " Jahr" + (age == 1 ? "" : "e") + " alt.");
    }
	
	
	
	
	
/*	static class Robot {
		
	    private int age; // Attribut zur Speicherung des Alters

	    // Konstruktor, um das Alter beim Erstellen eines Roboters festzulegen
	    public Robot(int age) {
	        this.age = age;
	    }

	    // Methode zur Ausgabe des Alters
	      void sayAge() {
	        System.out.println("Ich bin " + age + " Jahr" + (age == 1 ? "" : "e") + " alt.");
	    }
	}

	static class Story2 {
		
	    public static void main(String[] args) {
	        // Erzeugung eines Roboters mit dem Namen robin und Alter 1
	        Robot robin = new Robot(1);

	        // Aufruf der Methode sayAge() auf dem robin-Objekt
	        robin.sayAge();
	        
	      
	    }
	}
	
	public static void main(String[] args) {
        // Erzeugung eines Roboters mit dem Namen robin und Alter 1
        Robot robin = new Robot(1);

        // Aufruf der Methode sayAge() auf dem robin-Objekt
        robin.sayAge();
        
	}  */
}

