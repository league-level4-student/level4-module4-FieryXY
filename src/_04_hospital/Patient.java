package _04_hospital;

public class Patient {
	private boolean cared = false;
	boolean hasDoctor = false;
	public boolean feelsCaredFor() {
		return cared;
	}
	public void checkPulse() {
		cared = true;
	}
	public void medicineGiven() {
		cared = true;
	}
}
