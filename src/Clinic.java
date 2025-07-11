
public class Clinic {
        public static void main(String[] args) {
            Patient patient1 = new Patient("Валера", 1);
            Patient patient2 = new Patient("Инакентий", 2);
            Patient patient3 = new Patient("Олег", 3);

            patient1.treat();
            System.out.println();
            patient2.treat();
            System.out.println();
            patient3.treat();
        }
    }