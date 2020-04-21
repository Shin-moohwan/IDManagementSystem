import java.util.ArrayList;
import java.util.Scanner;

import id.Id;
import id.SometimesuseId;

public class IdManager {
	ArrayList<Id> ids = new ArrayList<Id>();
	Scanner input;
	IdManager(Scanner input) {
		this.input = input;
	}

	public void addId() {
		int kind = 0;
		Id id;
		while (kind != 1 && kind != 2) {
			System.out.print("1 for often use Id, ");
			System.out.print("2 for sometimes use Id, ");
			System.out.print("Select num for Id Kind between 1 and 2:");
			kind = input.nextInt();
			if (kind == 1) {
				id = new Id();
				id.getUserInput(input);
				ids.add(id);
				break;
			}
			else if (kind == 2) {
				id = new SometimesuseId();	
				id.getUserInput(input);
				ids.add(id);
				break;
			}
			else {
				System.out.print("Select num for Id Kind between 1 and 2:");
			}
		}


	}

	public void deleteId() {
		System.out.print("Your Id number:");
		int idnumber = input.nextInt();
		int index = -1;
		for (int i = 0; i<ids.size(); i++) {
			if (ids.get(i).getIdnumber() == idnumber) {
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
			if (id.getIdnumber() == idnumber) {
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
						String yourid = input.next();
						id.setYourid(yourid);
					}
					else if (num == 2) {
						System.out.print("Id Site:");
						String idsite = input.next();
						id.setIdsite(idsite);
					}
					else if (num == 3) {
						System.out.print("Id password:");
						String password = input.next();
						id.setPassword(password);
					}
					else if (num == 4) {
						System.out.print("Id number:");
						int idnumber1 = input.nextInt();
						id.setIdnumber(idnumber1);
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
		System.out.println("# of registered Ids:" + ids.size());
		for (int i = 0; i<ids.size(); i++) {
			ids.get(i).printInfo();
		}

	}
}
