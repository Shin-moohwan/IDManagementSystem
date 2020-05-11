package id;

import java.util.Scanner;

public class SometimesuseId extends UsuallyId {
	
	public SometimesuseId(IdKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setIdNumber(input);
		setYourId(input);
		setIdSiteWithYN(input);
		setIdPassword(input);
	}
}
