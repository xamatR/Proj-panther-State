package com.example.proj.pathern;
import com.example.proj.pathern.Patient;
import com.example.proj.pathern.PatientState;

public class PatientStateDead extends PatientState{

    private PatientStateDead() {};

    private static PatientStateDead instance = new PatientStateDead();

    public static PatientStateDead getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "Dead";
    }
}
