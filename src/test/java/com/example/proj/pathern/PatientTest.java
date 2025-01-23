package com.example.proj.pathern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {

    Patient patient;

    @BeforeEach
    public void setUp() {
        patient = new Patient();
    }


    // Adimitted
    @Test
    void testAdmittedToCritial() {
        patient.setState(PatientStateAdmitted.getInstance());
        assertTrue(patient.Critical());
        assertEquals(PatientStateCritical.getInstance(), patient.getState());
    }

    @Test
    void testAdmittedToStable() {
        patient.setState(PatientStateAdmitted.getInstance());
        assertTrue(patient.Stable());
        assertEquals(PatientStateStable.getInstance(), patient.getState());
    }

    @Test
    void testAdmittedToSerious() {
        patient.setState(PatientStateAdmitted.getInstance());
        assertTrue(patient.Serious());
        assertEquals(PatientStateSerious.getInstance(), patient.getState());
    }

    // Critical
    @Test
    void testCriticalToSerius() {
        patient.setState(PatientStateCritical.getInstance());
        assertTrue(patient.Serious());
        assertEquals(PatientStateSerious.getInstance(), patient.getState());
    }

    @Test
    void testCriticalToDead() {
        patient.setState(PatientStateCritical.getInstance());
        assertTrue(patient.Dead());
        assertEquals(PatientStateDead.getInstance(), patient.getState());
    }

    @Test
    void testDead(){
        patient.setState(PatientStateDead.getInstance());
        assertFalse(patient.Dead());
    }

    @Test
    void testDeadToRecovered() {
        patient.setState(PatientStateDead.getInstance());
        assertFalse(patient.Recovered());
    }

    // Recovered

    @Test
    void testRecoveredToAdmitted() {
        patient.setState(PatientStateRecovered.getInstance());
        assertTrue(patient.Admitted());
        assertEquals(PatientStateAdmitted.getInstance(), patient.getState());
    }

    @Test
    void testRecoveredToDead() {
        patient.setState(PatientStateRecovered.getInstance());
        assertFalse(patient.Dead());
    }

    // Serious

    @Test
    void testSeriousToCritical() {
        patient.setState(PatientStateSerious.getInstance());
        assertTrue(patient.Critical());
        assertEquals(PatientStateCritical.getInstance(), patient.getState());
    }

    @Test
    void testSeriousToStable() {
        patient.setState(PatientStateSerious.getInstance());
        assertTrue(patient.Stable());
        assertEquals(PatientStateStable.getInstance(), patient.getState());
    }

    @Test
    void testSeriousToDead() {
        patient.setState(PatientStateSerious.getInstance());
        assertFalse(patient.Dead());
    }

    // Stable

    @Test
    void testStableToSerious() {
        patient.setState(PatientStateStable.getInstance());
        assertTrue(patient.Serious());
        assertEquals(PatientStateSerious.getInstance(), patient.getState());
    }

    @Test
    void testStableToRecovered() {
        patient.setState(PatientStateStable.getInstance());
        assertTrue(patient.Recovered());
        assertEquals(PatientStateRecovered.getInstance(), patient.getState());
    }

    @Test
    void testStableToDead() {
        patient.setState(PatientStateStable.getInstance());
        assertFalse(patient.Dead());
    }
}
