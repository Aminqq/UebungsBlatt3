package Uebungsblatt3;

public class Aufgabe3 {
	
	static class ReadingRobot {
		private String  getTask() {
			return "Ich lese codierte Nachrichten.";
		}
		
	}

	
	public static class Story3 {
	    public static void main(String[] args) {

	    }
	}
	public static void main(String[] args) {
		
        ReadingRobot robot = new ReadingRobot();
        String task = robot.getTask();
        System.out.println(task);
	}
}
