class Surgeon extends Doctor {
    public Surgeon(String name) {
        super(name);
    }

    public String treat() {
        return "Удалит палец  ";
    }
}
