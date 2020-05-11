package id;

import java.util.Scanner;

public abstract class UsuallyId extends Id {
	
	public UsuallyId(IdKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input) ;
	
	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "yourid:" + yourid + " idsite:" + idsite + " password:" + password);
	}

	public void setIdSiteWithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have an id site? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Id Site:");
				String idsite = input.next();
				this.setIdsite(idsite);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setIdsite("");
				break;
			}
			else {

			}
		}
	}


}
