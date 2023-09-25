/*
 * Class: CMSC203 20984
 * Instructor:Ahmed Tarek
 * Description: a program that displays the following information:
the patient’s information, information about all three of the procedures, each procedure is displayed tab-separated, the total charges of the three procedures displayed in commas separated with two decimal points.

 * Due: 09/25/2023
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _____Valerie Ralph-Opara_____
*/
package Assignment2;
import java.util.Scanner;


public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter Patient Information:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Street Address: ");
        String streetAddress = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("ZIP Code: ");
        String zipCode = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Emergency Contact Name: ");
        String emergencyContactName = scanner.nextLine();
        System.out.print("Emergency Contact Phone: ");
        String emergencyContactPhone = scanner.nextLine();
        System.out.print("MC Number: ");
        String patientID = scanner.nextLine();

        
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode,
                                      phoneNumber, emergencyContactName, emergencyContactPhone, patientID);

        Procedure procedure1, procedure2, procedure3;

        
        System.out.println("Enter Procedure 1: ");
        procedure1 = createProcedure(scanner);

        System.out.println("Enter Procedure 2 Information:");
        procedure2 = createProcedure(scanner);

        System.out.println("Enter Procedure 3 Information:");
        procedure3 = createProcedure(scanner);

        System.out.println();
        System.out.println("Patient Info:");
        displayPatient(patient);

        
        System.out.println("\tProcedure");
        displayProcedure(procedure1);

        System.out.println("\tProcedure:");
        displayProcedure(procedure2);

        System.out.println("\tProcedure 3");
        displayProcedure(procedure3);

        
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("Total Charges: $" + String.format("%.2f", totalCharges));
        System.out.println();
        System.out.println("Student Name: " + patient.getFirstName() + " "+ patient.getLastName()); 
        System.out.println("MC#: " + patient.getPatientID());
        System.out.println("Due Date: 09/25/2023"); 
        scanner.close();

        
        scanner.close();
    }

    public static Procedure createProcedure(Scanner scanner) {
        System.out.print("Procedure: ");
        String procedureName = scanner.nextLine();
        System.out.print("ProcedureDate= ");
        String procedureDate = scanner.nextLine();
        System.out.print("Practitioner= ");
        String practitionerName = scanner.nextLine();
        System.out.print("Charge: ");
        double procedureCharges = scanner.nextDouble();
        scanner.nextLine(); 

        return new Procedure(procedureName, procedureDate, practitionerName, procedureCharges);
    }

    public static void displayPatient(Patient patient) {
        System.out.println("Full Name: " + patient.buildFullName());
        System.out.println("Address: " + patient.buildAddress());
        System.out.println("Emergency Contact: " + patient.buildEmergencyContact());
        System.out.println();
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println("\tProcedure: " + procedure.getProcedureName());
        System.out.println("\tProcedureDate= " + procedure.getProcedureDate());
        System.out.println("\tPractitioner= " + procedure.getPractitionerName());
        System.out.println("\tCharges: $" + String.format("%.2f", procedure.getProcedureCharges()));
        System.out.println();
    }

    public static double calculateTotalCharges(Procedure... procedures) {
        double totalCharges = 0;
        for (Procedure procedure : procedures) {
            totalCharges += procedure.getProcedureCharges();
        }
        return totalCharges;
    }
}


