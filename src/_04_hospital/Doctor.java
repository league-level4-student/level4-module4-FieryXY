package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	private ArrayList<Patient> myPatients;
	
	Doctor() {
		myPatients = new ArrayList<Patient>();
	}
	
	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient p) throws DoctorFullException {
		if(myPatients.size() < 3) {
			myPatients.add(p);
			myPatients.get(myPatients.size()-1).hasDoctor = true;
		}
		else {
			throw new DoctorFullException();
		}
	}
	ArrayList<Patient> getPatients() {
		return myPatients;
	}
	
	public void doMedicine() {
		for(Patient p: myPatients) {
			p.medicineGiven();
		}
	}
}
