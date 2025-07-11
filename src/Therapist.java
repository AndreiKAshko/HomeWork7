
class Therapist extends Doctor {
    public Therapist(String name) {
        super(name);
    }

    public String treat() {
        return "Отправит на анализы";
    }
}
