class Dentist extends Doctor {
    public Dentist(String name) {
        super(name);
    }

    public String treat() {
        return "Удалит зуб";
    }
}
