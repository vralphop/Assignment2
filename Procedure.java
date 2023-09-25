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

public class Procedure {
	
	    private String procedureName;
	    private String procedureDate;
	    private String practitionerName;
	    private double procedureCharges;

	    
	    public Procedure() {
	    }

	    
	    public Procedure(String procedureName, String procedureDate) {
	        this.procedureName = procedureName;
	        this.procedureDate = procedureDate;
	    }

	    
	    public Procedure(String procedureName, String procedureDate,
	                     String practitionerName, double procedureCharges) {
	        this.procedureName = procedureName;
	        this.procedureDate = procedureDate;
	        this.practitionerName = practitionerName;
	        this.procedureCharges = procedureCharges;
	    }

	    

	    public String getProcedureName() {
	        return procedureName;
	    }

	    public void setProcedureName(String procedureName) {
	        this.procedureName = procedureName;
	    }

	    public String getProcedureDate() {
	        return procedureDate;
	    }

	    public void setProcedureDate(String procedureDate) {
	        this.procedureDate = procedureDate;
	    }

	    public String getPractitionerName() {
	        return practitionerName;
	    }

	    public void setPractitionerName(String practitionerName) {
	        this.practitionerName = practitionerName;
	    }

	    public double getProcedureCharges() {
	        return procedureCharges;
	    }

	    public void setProcedureCharges(double procedureCharges) {
	        this.procedureCharges = procedureCharges;
	    }

	    
	    @Override
	    public String toString() {
	        return 
	               "Procedure Name: " + procedureName + "\n" +
	               "Procedure Date: " + procedureDate + "\n" +
	               "Practitioner Name: " + practitionerName + "\n" +
	               "Procedure Charges: $" + String.format("%.2f", procedureCharges);
	    }
	}


