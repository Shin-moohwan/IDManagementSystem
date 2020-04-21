package id;

import java.util.Scanner;

public class Id {
	protected IdKind kind = IdKind.Oftenuse;
	protected String yourid;
	protected int idnumber;
	protected String idsite;
	protected String password;
	
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
	
	public IdKind getKind() {
		return kind;
	}

	public void setKind(IdKind kind) {
		this.kind = kind;
	}

	public String getYourid() {
		return yourid;
	}

	public void setYourid(String yourid) {
		this.yourid = yourid;
	}

	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}

	public String getIdsite() {
		return idsite;
	}

	public void setIdsite(String idsite) {
		this.idsite = idsite;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void printInfo() {
		System.out.println("yourid:" + yourid + " idsite:" + idsite + " password:" + password);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Id number:");
		int idnumber = input.nextInt();
		this.setIdnumber(idnumber);
		
		System.out.print("Your Id:");
		String yourid = input.next();
		this.setYourid(yourid);
		
		System.out.print("Id Site:");
		String idsite = input.next();
		this.setIdsite(idsite);
		
		System.out.print("Id password:");
		String password = input.next();
		this.setPassword(password);
		
	}
}
