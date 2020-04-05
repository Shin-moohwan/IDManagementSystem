import java.util.Scanner;

public class MenuManager{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IdManager idmanager = new IdManager(input);
		
		int num = -1;
		while (num != 5) {
			System.out.println("### Id Management System Menu ###");
			System.out.println("1. Add Id");
			System.out.println("2. Delete Id");
			System.out.println("3. Edit Id");
			System.out.println("4. View Id");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			if (num == 1) {
				idmanager.addId();
			}
			else if (num == 2) {
				idmanager.deleteId();
			}
			else if (num == 3) {
				idmanager.editId();
			}
			else if (num == 4) {
				idmanager.viewId();
			}
			else {
				continue;
			}
		}
	}
}