public class Id {
	String yourid;
	int idnumber;
	String idsite;
	String password;
	
	public Id() {
	}
	
	public Id(String yourid, int idnumber) {
		this.yourid = yourid;
		this.idnumber = idnumber;
	}
		
	public Id(String yourid, int idnumber, String idsite, String password) {
		this.yourid = yourid;
		this.idnumber = idnumber;
		this.idsite = idsite;
		this.password = password;
	}
	
	public void printInfo() {
		System.out.println("yourid:" + yourid + " idsite:" + idsite + " password:" + password);
	}
}
