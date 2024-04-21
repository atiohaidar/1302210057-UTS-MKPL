package lib;

import java.util.List;

public class EmployeeFamily {

	private String spouseNadme;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;

    	childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>()
        
    

    public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	
}
