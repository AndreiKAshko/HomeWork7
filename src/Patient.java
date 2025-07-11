class Patient {
    private String name;
    private int Plan;
    private Doctor doctor;

    public Patient(String name, int Plan) {
        this.name = name;
        this.Plan = Plan;
        assignDoctor();
    }

    private void assignDoctor() {
        switch (Plan) {
            case 1:
                doctor = new Surgeon("Хирургу");
                break;
            case 2:
                doctor = new Therapist("Терапевту");
                break;
            case 3:
                doctor = new Dentist("Дантисту");
                break;
            default:
        }
    }

    public void treat() {
        System.out.println("Бедолага " + name + " направлен к мучителю " + doctor.getName());
        System.out.println("который возможно: " + doctor.treat());
    }
}
