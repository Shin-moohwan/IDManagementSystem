package id;

import java.util.Scanner;

import exception.IdsiteFormException;

public class OftenuseId extends UsuallyId {

	protected String secondyourid;
	protected String secondpassword;

	public OftenuseId(IdKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setIdNumber(input);
		setYourId(input);
		setIdSiteWithYN(input);
		setSecondIdSiteWithYN(input);

		setIdPassword(input);
	}

	public void setSecondIdSiteWithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have a second idsite? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setIdSite(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setIdsite("");
					break;
				}
				else {
				}
			}
			catch(IdsiteFormException e) {
				System.out.println("Incorrect Idsite Format. put the Idsite that contains '@'");
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " yourid:" + yourid + " idsite:" + idsite + " password:" + password + "secondyourid:" + yourid + " secondpassword:" + password);
	}
}
