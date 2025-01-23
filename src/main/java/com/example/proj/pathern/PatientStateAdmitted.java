package com.example.proj.pathern;
import com.example.proj.pathern.Patient;
import com.example.proj.pathern.PatientState;
import com.example.proj.pathern.PatientStateStable;
import com.example.proj.pathern.PatientStateCritical;
import com.example.proj.pathern.PatientStateSerious;

public class PatientStateAdmitted extends PatientState{

    private PatientStateAdmitted() {};

    private static PatientStateAdmitted instance = new PatientStateAdmitted();

    public static PatientStateAdmitted getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "Admitted";
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

    @Override
    public Boolean Serious(Patient patient) {
        patient.setState(PatientStateSerious.getInstance());
        return true;
    }
    
}
