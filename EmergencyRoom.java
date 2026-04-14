import java.util.*;

public class EmergencyRoom {

    PriorityQueue<Patient> pq;
    HashMap<Integer, Patient> patientMap;

    public EmergencyRoom() {
        pq = new PriorityQueue<>(
            (a, b) -> b.getPriority() - a.getPriority()
        );
        patientMap = new HashMap<>();
    }

    // Insert patient
    public void admitPatient(Patient p) {
        pq.add(p);
        patientMap.put(p.id, p);
        System.out.println("Admitted: " + p.name);
    }

    // Treat next patient
    public void treatNext() {
        if (pq.isEmpty()) {
            System.out.println("No patients waiting.");
            return;
        }
        Patient p = pq.poll();
        patientMap.remove(p.id);
        System.out.println("Treating: " + p.name);
    }

    // Update severity
    public void updateSeverity(int id, int newSeverity) {
        Patient p = patientMap.get(id);
        if (p != null) {
            pq.remove(p);
            p.severity = newSeverity;
            pq.add(p);
            System.out.println("Updated severity of " + p.name);
        }
    }

    // Aging mechanism
    public void applyAging() {
        for (Patient p : pq) {
            p.ageFactor += 1;
        }
    }
}