class Patient {
    int id;
    String name;
    int severity;       // Higher value = higher urgency
    long arrivalTime;
    int ageFactor;

    public Patient(int id, String name, int severity) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.arrivalTime = System.currentTimeMillis();
        this.ageFactor = 0;
    }

    public int getPriority() {
        return severity + ageFactor;
    }
}