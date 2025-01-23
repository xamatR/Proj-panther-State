package com.example.proj.pathern;

public abstract class PatientState {
    public abstract String getState();

    public Boolean Critical(Patient patient){
        return false;
    };
    
    public Boolean Stable(Patient patient){
        return false;
    };

    public Boolean Serious(Patient patient){
        return false;
    };

    public Boolean Dead(Patient patient){
        return false;
    };

    public Boolean Recovered(Patient patient){
        return false;
    };

    public Boolean Admitted(Patient patient){
        return false;
    };


}
