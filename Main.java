public class Main {
    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.admitPatient(new Patient(1, "John", 20));    // Low
        er.admitPatient(new Patient(2, "Alex", 30));    // Medium
        er.admitPatient(new Patient(3, "Mary", 40));    // High
        er.admitPatient(new Patient(4, "Sarah", 50));   // Critical

        er.treatNext();
        er.applyAging();
        er.treatNext();
    }
}