package ch.wagner.root.crypt;

import java.util.Scanner;

public class Input
{
	public static char[] getText (String requestMessage)
	{
		boolean _AllowedToContinue = false;

		char[] text = null;
		while (!_AllowedToContinue)
		{
			System.out.print(requestMessage);
			text = ch.wagner.root.crypt.Input.getCharArray();

			if (!Process.inputValid(new String(text), "[^`^]+$"))
				System.out.println("Invalid input. Try again.");
			else
				_AllowedToContinue = true;
		}

//		System.err.println(new String(text).length());

		return text;
	}

	public static char[] getKey (String requestMessage)
	{
		boolean _AllowedToContinue = false;

		char[] key = null;
		while (!_AllowedToContinue)
		{
			System.out.print(requestMessage);
			key = ch.wagner.root.crypt.Input.getCharArray();

			if (!Process.inputValid(new String(key), "^[A-Za-z]+$"))
				System.out.println("Invalid input. Try again.");
			else
				_AllowedToContinue = true;
		}

		return key;
	}

	private static String getString ()
	{
		Scanner scanner = new Scanner(System.in);

		return scanner.nextLine();
	}

	public static char[] getCharArray ()
	{
		return getString().toCharArray();
	}
}
