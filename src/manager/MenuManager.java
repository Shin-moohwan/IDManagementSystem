package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager{
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		IdManager idmanager = getObject("idmanager.ser");
		if (idmanager == null) {
			idmanager = new IdManager(input);
		}
		else {
			idmanager.setScanner(input);
		}

		WindowFrame frame = new WindowFrame(idmanager);
		selectMenu(input, idmanager);
		putObject(idmanager, "idmanager.ser");
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
					logger.log("add a id");
					break;
				case 2:
					idmanager.deleteId();
					logger.log("delete a id");
					break;
				case 3:
					idmanager.editId();
					logger.log("edit a id");
					break;
				case 4:
					idmanager.viewIds();
					logger.log("view a list of id");
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

	public static IdManager getObject(String filename) {
		IdManager idmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			idmanager = (IdManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return idmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return idmanager;	
	}

	public static void putObject(IdManager idmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(idmanager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}