package Uebungsblatt3;

public class Aufgabe1 {

    static class Roboter {
       void gibInfo() {
            System.out.println("Ich bin ein Montage-Roboter und baue ein Auto.");
        }
    }

    static class LesenderRoboter {
        void gibInfo() {
            System.out.println("Ich bin ein Lese-Roboter und kann lesen.");
        }
    }

     static class Story1 {
        public static void main(String[] args) {
            Roboter robo = new Roboter();
            robo.gibInfo();
            
            LesenderRoboter buecherwurm = new LesenderRoboter();
	         buecherwurm.gibInfo();
        }
    }

	    public static void main(String[] args) {
	        // Hier kannst du weitere Dinge tun, wenn nötig
	    	
	    	Roboter robo = new Roboter();
	            robo.gibInfo();
	            
            LesenderRoboter buecherwurm = new LesenderRoboter();
		         buecherwurm.gibInfo();
	     }
    }






	








