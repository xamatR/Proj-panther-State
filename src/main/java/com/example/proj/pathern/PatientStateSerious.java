package com.example.proj.pathern;
import com.example.proj.pathern.Patient;
import com.example.proj.pathern.PatientState;

public class PatientStateSerious extends PatientState{

    private PatientStateSerious() {};

    private static PatientStateSerious instance = new PatientStateSerious();

    public static PatientStateSerious getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "Serious";
    }

    @Override
    public Boolean Critical(Patient patient) {
        patient.setState(PatientStateCritical.getInstance());
        return true;
    }

    @Override
    public Boolean Stable(Patient patient) {
        patient.setState(PatientStateStable.getInstance());
        return true;
    }    
}