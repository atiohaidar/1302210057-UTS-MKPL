package lib;

/**
 * class ini berfungsi untuk mengatur salary dari karyawah
 */
public class EmployeeSalary{

 private int monthlySalary = 0;
	private int otherMonthlyIncome = 0;
	private int annualDeductible = 0;
	private boolean isForeigner;
	   /**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	public EmployeeSalary(boolean isForeigner){
		this.isForeigner = isForeigner;

	}

/**
 * Fungsi setMothlySalary berguna untuk menentukan gaji dari karyawan bedasarkan grade dan bedasarkan apkah dia forigner atau bukan
 * @param grade
 */
	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}
/**
 * fungsi ini berfungsi untuk mengubah Annual Dectible dari karyawan
 * @param deductible
 */
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}


	public int getMonthlySalary() {
		return monthlySalary;
	}


	public int getOtherMonthlyIncome() {
		return otherMonthlyIncome;
	}


	public void setOtherMonthlyIncome(int otherMonthlyIncome) {
		this.otherMonthlyIncome = otherMonthlyIncome;
	}


	public int getAnnualDeductible() {
		return annualDeductible;
	}


	public boolean isForeigner() {
		return isForeigner;
	}


	public void setForeigner(boolean isForeigner) {
		this.isForeigner = isForeigner;
	}
}