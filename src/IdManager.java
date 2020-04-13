import java.util.ArrayList;
import java.util.Scanner;

public class IdManager {
	ArrayList<Id> ids = new ArrayList<Id>();
	Scanner input;
	IdManager(Scanner input) {
		this.input = input;
	}

	public void addId() {
		Id id = new Id();
		System.out.print("Id number:");
		id.idnumber = input.nextInt();
		System.out.print("Your Id:");
		id.yourid = input.next();
		System.out.print("Id Site:");
		id.idsite = input.next();
		System.out.print("Id password:");
		id.password = input.next();
		ids.add(id);
	}

	public void deleteId() {
		System.out.print("Your Id number:");
		int idnumber = input.nextInt();
		int index = -1;
		for (int i = 0; i<ids.size(); i++) {
			if (ids.get(i).idnumber == idnumber) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			ids.remove(index);
			System.out.println("the id " + idnumber + " is deleted");
		}
		else {
			System.out.println("the id has no been registered");
			return;
		}

	}
	public void editId() {
		System.out.print("Your Id number:");
		int idnumber = input.nextInt();
		for (int i = 0; i<ids.size(); i++) {
			Id id = ids.get(i);
			if (id.idnumber == idnumber) {
				int num = -1;
				while (num != 5) {
					System.out.println("## Id Info Edit Menu ##");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Idsite");
					System.out.println("3. Edit Password");
					System.out.println("4. Edit Id number");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1 - 5:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Your Id:");
						id.yourid = input.next();
					}
					else if (num == 2) {
						System.out.print("Id Site:");
						id.idsite = input.next();
					}
					else if (num == 3) {
						System.out.print("Id password:");
						id.password = input.next();
					}
					else if (num == 4) {
						System.out.print("Id number:");
						id.idnumber = input.nextInt();
					} 
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	public void viewIds() {
		//		System.out.print("Your Id number:");
		//		int idnumber = input.nextInt();
		for (int i = 0; i<ids.size(); i++) {
			ids.get(i).printInfo();
		}

	}
}
