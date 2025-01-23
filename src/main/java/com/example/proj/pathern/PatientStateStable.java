package com.example.proj.pathern;
import com.example.proj.pathern.Patient;
import com.example.proj.pathern.PatientState;
import com.example.proj.pathern.PatientStateRecovered;

public class PatientStateStable extends PatientState{

    private PatientStateStable() {};

    private static PatientStateStable instance = new PatientStateStable();

    public static PatientStateStable getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "Stable";
    }

    @Override
    public Boolean Serious(Patient patient) {
        patient.setState(PatientStateSerious.getInstance());
        return true;
    }

    @Override
    public Boolean Recovered(Patient patient) {
        patient.setState(PatientStateRecovered.getInstance());
        return true;
    }
    
}
