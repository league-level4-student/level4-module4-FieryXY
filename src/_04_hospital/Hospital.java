package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	
	Hospital() {
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}
	
	//Encapsulation Functions
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void addPatient(Patient p) {
		patients.add(p);
	}
	ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void assignPatientsToDoctors() {
		int doctorIndex = 0;
		int patientIndex = 0;
		int needed = 0;
		for(Patient p:patients) {
			if(p.hasDoctor == false) {
				needed++;
			}
		}
		while(patientIndex < needed) {
			try {
				doctors.get(doctorIndex).assignPatient(patients.get(patientIndex));
				patientIndex++;
			}
			catch(DoctorFullException e) {
				if(doctorIndex < doctors.size()-1) {
					doctorIndex++;
				}
				else {
					//All doctors full
					break;
				}
			}
		}
	}
}
