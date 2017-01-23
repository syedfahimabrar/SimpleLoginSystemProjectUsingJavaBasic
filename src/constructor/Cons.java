package constructor;

import java.util.Scanner;

public class Cons {

	public static void main(String[] args) {
		System.out.println("Login System");
		Scanner scanner=new Scanner(System.in);
		String Password,Username;
		System.out.println("Please Registration");
		System.out.print("Username = ");
		Username=scanner.nextLine();
		System.out.print("\npassword = ");
		Password=scanner.nextLine();
		System.out.println("Successfully Registered");
		Userdata setdata= new Userdata(Username, Password);
		System.out.println("Wanna Login?");
		System.out.print("Username = ");
		Username=scanner.nextLine();
		System.out.print("\nPassword = ");
		Password=scanner.nextLine();
		if(setdata.passmatch(Username, Password)==true)
			System.out.println("Successfully Login");
		else System.out.println("Incorrect Handle or Password");
	}

}
