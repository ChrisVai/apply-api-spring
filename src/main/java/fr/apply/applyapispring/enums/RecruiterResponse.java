package fr.apply.applyapispring.enums;

public enum RecruiterResponse {
   NO ("Négative"),
    YES ("Positive"),
    NONE ("Aucune");

    public final String label;

    RecruiterResponse(String label) {
       this.label = label;
   }
}
