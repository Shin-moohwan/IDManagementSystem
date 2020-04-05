import java.util.Scanner;

public class IdManager {
	Id id;
	Scanner input;
	IdManager(Scanner input) {
		this.input = input;
	}
	
	public void addId() {
		id = new Id();
		System.out.print("Id number:");
		id.idnumber = input.nextInt();
		System.out.print("Your Id:");
		id.yourid = input.next();
		System.out.print("Id Site:");
		id.idsite = input.next();
		System.out.print("Id password:");
		id.password = input.next();
	}
	public void deleteId() {
		System.out.print("Your Id number:");
		int idnumber = input.nextInt();
		if (id == null) {
			System.out.println("the id has not been registered");
			return;
		}
		if (id.idnumber == idnumber) {
			id = null;
			System.out.println("the id is deleted");
		}
	}
	public void editId() {
		System.out.print("Your Id number:");
		int idnumber = input.nextInt();
		if (id.idnumber == idnumber) {
			System.out.println("the id to be edited is " + idnumber);
		}
	}
	public void viewId() {
		System.out.print("Your Id number:");
		int idnumber = input.nextInt();
		if (id.idnumber == idnumber) {
			id.printInfo();
		}
	}
}
