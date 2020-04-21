package id;

import java.util.Scanner;

public class SometimesuseId extends Id {

	public void getUserInput(Scanner input) {
		System.out.print("Id number:");
		int idnumber = input.nextInt();
		this.setIdnumber(idnumber);

		System.out.print("Your Id:");
		String yourid = input.next();
		this.setYourid(yourid);

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
		
		System.out.print("Id Site:");
		String idsite = input.next();
		this.setIdsite(idsite);

		System.out.print("Id password:");
		String password = input.next();
		this.setPassword(password);
	}
}
