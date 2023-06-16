package tddmicroexercises.telemetrysystem;

public interface DiagnosticControls {
    void checkTransmission() throws Exception;
    String getDiagnosticInfo();
    void setDiagnosticInfo(String diagnosticInfo);
}
