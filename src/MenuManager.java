import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IdManager idmanager = new IdManager(input);

		selectMenu(input, idmanager);

	}

	public static void selectMenu(Scanner input, IdManager idmanager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					idmanager.addId();
					break;
				case 2:
					idmanager.deleteId();
					break;
				case 3:
					idmanager.editId();
					break;
				case 4:
					idmanager.viewIds();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Pleas put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("### Id Management System Menu ###");
		System.out.println("1. Add Id");
		System.out.println("2. Delete Id");
		System.out.println("3. Edit Id");
		System.out.println("4. View Ids");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
}