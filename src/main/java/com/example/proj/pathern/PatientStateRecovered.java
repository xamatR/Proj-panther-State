package com.example.proj.pathern;
import com.example.proj.pathern.Patient;
import com.example.proj.pathern.PatientState;

public class PatientStateRecovered extends PatientState{

    private PatientStateRecovered() {};

    private static PatientStateRecovered instance = new PatientStateRecovered();

    public static PatientStateRecovered getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "Recoverred";
    }

    @Override
    public Boolean Admitted(Patient patient) {
        patient.setState(PatientStateAdmitted.getInstance());
        return true;
    }
    
}
