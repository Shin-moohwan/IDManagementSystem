import java.util.Scanner;

public class IdManager{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {
			System.out.println("### Id Management System Menu ###");
			System.out.println("1. Add Id");
			System.out.println("2. Delete Id");
			System.out.println("3. Edit Id");
			System.out.println("4. View Id");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			if (num == 1) {
				addId();
			}
			else if (num == 2) {
				deleteId();
			}
			else if (num == 3) {
				editId();
			}
			else if (num == 4) {
				viewId();
			}
			else {
				continue;
			}
		}
	}
	public static void addId() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Id:");
		String yourid = input.nextLine();
		System.out.print("Id Site:");
		String idname = input.nextLine();
		System.out.print("Id password:");
		String password = input.nextLine();
		System.out.println(idname);
	}
	public static void deleteId() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Id:");
		String yourid = input.nextLine();
	}
	public static void editId() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Id:");
		String yourid = input.nextLine();
	}
	public static void viewId() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Id:");
		String yourid = input.nextLine();
	}
}
