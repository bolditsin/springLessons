public class Clinic {
    private IDoctor doctor;

    public static void guidePatient(IDoctor doctor) {
        System.out.println("Ваш врач: ");
        doctor.chooseDoctor();
    }
}
