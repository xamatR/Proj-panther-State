package com.example.proj.pathern;
import com.example.proj.pathern.PatientState;

public class Patient {
    private String name;
    private String age;
    private String perscription;
    private String disease;
    private PatientState state;

    public Patient (){
        this.state = PatientStateAdmitted.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPerscription() {
        return perscription;
    }

    public void setPerscription(String perscription) {
        this.perscription = perscription;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public PatientState getState() {
        return state;
    }

    public void setState(PatientState state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getState();
    }

    public Boolean Critical() {
        return state.Critical(this);
    }

    public Boolean Admitted() {
        return state.Admitted(this);
    }

    public Boolean Stable() {
        return state.Stable(this);
    }

    public Boolean Serious() {
        return state.Serious(this);
    }

    public Boolean Dead() {
        return state.Dead(this);
    }

    public Boolean Recovered() {
        return state.Recovered(this);
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nDisease: " + disease + "\nPerscription: " + perscription + "\nState: " + state.getState();
    }
        
}
