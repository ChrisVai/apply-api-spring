package fr.apply.applyapispring.enums;

public enum ApplicationStatus {
    TO_APPLY ("A Postuler"),
    APPLIED ("Postulé"),
    TO_RELAUNCH ("A relancer"),
    RELAUNCHED ("Relancé"),
    CLOSED ("Close");

    public final String label;

    ApplicationStatus(String label) {
        this.label = label;
    }
}
