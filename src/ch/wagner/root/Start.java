package ch.wagner.root;

import java.util.Scanner;

public class Start
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Would you like to encrypt or decrypt a message? [d/e]\n>");
		char de = scanner.nextLine().charAt(0);
		boolean _Encrypt = true;

		if (de == 'd')
			_Encrypt = false;
		else if (de == 'e')
			;
		else
		{
			System.out.println("Non valid input. Please try again later.");
			System.exit(1);
		}

		char[] text = ch.wagner.root.crypt.Input.getText("Text:\n>");

		char[] key = ch.wagner.root.crypt.Input.getKey("Key:\n>");

		if (_Encrypt)
			System.out.println(ch.wagner.root.crypt.Process.encrypt(text, key));
		else
			System.out.println(ch.wagner.root.crypt.Process.decrypt(text, key));
	}
}
