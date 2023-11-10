package Uebungsblatt3;

public class Aufgabe4 {
	
    public static void main(String[] args) {
    	
        Pkw smart = new Pkw();
        
        smart.farbe = "brilliantweiss metallic";
        
        System.out.println("Die Farbe des Pkw ist: " + smart.farbe);

        DetektivDuke detektivDuke = new DetektivDuke();
        detektivDuke.ermittleAuto(smart);
    }
}

class Pkw {
    String farbe;
}

class DetektivDuke {
    void ermittleAuto(Pkw auto) {
        System.out.println("Detektiv Duke fährt ein Auto mit der Farbe: " + auto.farbe);
    }
}

/*Option ist die korrekte Anweisung 
 * 
 * 
 * duke.answer("I ride a " + dm.getDescription());

*/
