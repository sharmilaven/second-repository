package org.company;

public class CompanyInfo {

	private void companyName() {
		
		System.out.println(" name ");

	}
	private void companyId() {
		
		System.out.println(" id ");
	}
		
		private void companyAddress() {
			
			System.out.println(" address ");
		}
		
		public static void main(String[] args) {
			CompanyInfo c = new CompanyInfo();
			c.companyId();
			c.companyAddress();
			c.companyName();
}
}
