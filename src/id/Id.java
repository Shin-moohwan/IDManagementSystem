package id;

import java.io.Serializable;
import java.util.Scanner;

import exception.IdsiteFormException;

public abstract class Id implements IdInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7947203192621171679L;
	
	protected IdKind kind = IdKind.Oftenuse;
	protected String yourid;
	protected int idnumber;
	protected String idsite;
	protected String password;

	public Id() {
	}

	public Id(IdKind kind) {
		this.kind = kind;
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

	public Id(IdKind kind, String yourid, int idnumber, String idsite, String password) {
		this.kind = kind;
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

	public void setIdsite(String idsite) throws IdsiteFormException {
		if (!idsite.contains("@") && !idsite.equals("")) {
			throw new IdsiteFormException();
		}
		this.idsite = idsite;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public abstract void printInfo();

	public void setYourId(Scanner input) {
		System.out.print("Your Id:");
		String yourid = input.next();
		this.setYourid(yourid);
	}

	public void setIdSite(Scanner input) {
		String idsite = "";
		while (!idsite.contains("@")) {
			System.out.print("Id Site:");
			idsite = input.next();
			try {
				this.setIdsite(idsite);
			} catch (IdsiteFormException e) {
				System.out.println("Incorrect Idsite Format. put the Idsite that contains @");
			}
		}
	}

	public void setIdPassword(Scanner input) {
		System.out.print("Id password:");
		String password = input.next();
		this.setPassword(password);
	}

	public void setIdNumber(Scanner input) {
		System.out.print("Id number:");
		int idnumber1 = input.nextInt();
		this.setIdnumber(idnumber1);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Oftenuse :
			skind = "Often.";
			break;
		case Sometimesuse :
			skind = "Sometimes.";
			break;
		case Alwaysuse :		
			skind = "Always.";
			break;
		case Neveruse :
			skind = "Never.";
			break;
		default : 
		}
		return skind;
	}
}
