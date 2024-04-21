package lib;

import java.time.LocalDate;
// import java.time.Month;
import java.util.LinkedList;
import java.util.List;


/**
 * class employee merupakan class yang menyimppan data daata employee
 */
public class Employee {

	// private String employeeId;
	// private String firstName;
	// private String lastName;
	private String idNumber;
	// private String address;
	
	private int yearJoined;
	private int monthJoined;
	// private int dayJoined;
	private int monthWorkingInYear;
	
	// private boolean isForeigner;
	// private boolean gender; //true = Laki-laki, false = Perempuan
	
	
	private EmployeeSalary employeeSalary;
	
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender) {
		// this.employeeId = employeeId;
		// this.firstName = firstName;
		// this.lastName = lastName;
		this.idNumber = idNumber;
		// this.address = address;
		this.yearJoined = yearJoined;
		this.monthJoined = monthJoined;
		// this.dayJoined = dayJoined;
		// this.isForeigner = isForeigner;
		// this.gender = gender;
		employeeSalary = new EmployeeSalary(isForeigner);

		
	;
	}

	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(employeeSalary.getMonthlySalary(), employeeSalary.getOtherMonthlyIncome(), monthWorkingInYear, getAnnualIncomeTax(), spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
