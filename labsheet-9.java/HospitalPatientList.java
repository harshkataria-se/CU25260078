import java.util.ArrayList;
import java.util.HashSet;

public class HospitalPatientList {
    public static void main(String[] args) {
        ArrayList<String> patientNames = new ArrayList<>();
        HashSet<String> patientIDs = new HashSet<>();

        patientNames.add("Rahul");
        patientNames.add("Amit");
        patientNames.add("Priya");
        patientNames.add("Neha");

        patientIDs.add("P101");
        patientIDs.add("P102");
        patientIDs.add("P103");
        patientIDs.add("P104");

        System.out.println("Initial Patient Names: " + patientNames);
        System.out.println("Initial Patient IDs: " + patientIDs);

        patientNames.add("Rohan");
        patientIDs.add("P105");

        System.out.println("\nAfter Adding Patient:");
        System.out.println("Patient Names: " + patientNames);
        System.out.println("Patient IDs: " + patientIDs);

        patientNames.remove("Amit");
        patientIDs.remove("P102");

        System.out.println("\nAfter Removing Patient:");
        System.out.println("Patient Names: " + patientNames);
        System.out.println("Patient IDs: " + patientIDs);

        String searchName = "Priya";
        String searchID = "P103";

        System.out.println("\nSearching Patient:");
        System.out.println("Patient Name Exists: " + patientNames.contains(searchName));
        System.out.println("Patient ID Exists: " + patientIDs.contains(searchID));

        System.out.println("\nFinal Patient Records:");

        for (int i = 0; i < patientNames.size(); i++) {
            System.out.println("Patient Name: " + patientNames.get(i));
        }

        System.out.println("Unique Patient IDs: " + patientIDs);
    }
}