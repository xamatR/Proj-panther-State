package com.example.proj.pathern;
import com.example.proj.pathern.Patient;
import com.example.proj.pathern.PatientState;

public class PatientStateCritical extends PatientState{

    private PatientStateCritical() {};

    private static PatientStateCritical instance = new PatientStateCritical();

    public static PatientStateCritical getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "Critical";
    }

    @Override
    public Boolean Serious(Patient patient) {
        patient.setState(PatientStateSerious.getInstance());
        return true;
    }

    @Override
    public Boolean Dead(Patient patient) {
        patient.setState(PatientStateDead.getInstance());
        return true;
    }
 

    


}
