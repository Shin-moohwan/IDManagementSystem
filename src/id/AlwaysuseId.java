package id;

import java.util.Scanner;

public class AlwaysuseId extends Id {
	
	public AlwaysuseId(IdKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setIdNumber(input);
		setYourId(input);
		setIdSite(input);
		setIdPassword(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "yourid:" + yourid + " idsite:" + idsite + " password:" + password);
	}

}
