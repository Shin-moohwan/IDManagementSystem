import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import id.AlwaysuseId;
import id.IdInput;
import id.IdKind;
import id.OftenuseId;
import id.SometimesuseId;

public class IdManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -648786209032333747L;

	ArrayList<IdInput> ids = new ArrayList<IdInput>();
	transient Scanner input;
	IdManager(Scanner input) {
		this.input = input;
	}

	public void setScanner(Scanner input) {
		this.input = input;
	}

	public void addId() {
		int kind = 0;
		IdInput idInput;
		while (kind != 1 && kind != 2) {
			try {
				System.out.println("1 for always use Id, ");
				System.out.println("2 for sometimes use Id, ");
				System.out.println("3 for often use Id, ");
				System.out.print("Select num 1, 2, or 3 for Id Kind:");
				kind = input.nextInt();
				if (kind == 1) {
					idInput = new AlwaysuseId(IdKind.Alwaysuse);
					idInput.getUserInput(input);
					ids.add(idInput);
					break;
				}
				else if (kind == 2) {
					idInput = new SometimesuseId(IdKind.Sometimesuse);	
					idInput.getUserInput(input);
					ids.add(idInput);
					break;
				}
				else if (kind == 3) {
					idInput = new OftenuseId(IdKind.Oftenuse);	
					idInput.getUserInput(input);
					ids.add(idInput);
					break;
				}
				else {
					System.out.print("Select num for Id Kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Pleas put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}


	public void deleteId() {
		System.out.print("Your Id number:");
		int idnumber = input.nextInt();
		int index = findIndex(idnumber);
		removefromIds(index, idnumber);
	}

	public int findIndex(int idnumber) {
		int index = -1;
		for (int i = 0; i<ids.size(); i++) {
			if (ids.get(i).getIdnumber() == idnumber) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromIds(int index, int idnumber) {
		if (index >= 0) {
			ids.remove(index);
			System.out.println("the id " + idnumber + " is deleted");
			return 1;
		}
		else {
			System.out.println("the id has no been registered");
			return -1;
		}
	}

	public void editId() {
		System.out.print("Your Id number:");
		int idnumber = input.nextInt();
		for (int i = 0; i<ids.size(); i++) {
			IdInput id = ids.get(i);
			if (id.getIdnumber() == idnumber) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						id.setYourId(input);
						break;
					case 2:
						id.setIdSite(input);
						break;
					case 3:
						id.setIdPassword(input);
						break;
					case 4:
						id.setIdNumber(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewIds() {
		System.out.println("# of registered Ids:" + ids.size());
		for (int i = 0; i<ids.size(); i++) {
			ids.get(i).printInfo();
		}
	}


	public void showEditMenu() {
		System.out.println("## Id Info Edit Menu ##");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Idsite");
		System.out.println("3. Edit Password");
		System.out.println("4. Edit Id number");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
}
