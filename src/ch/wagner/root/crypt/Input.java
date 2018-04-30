package ch.wagner.root.crypt;

import java.util.Scanner;
import java.util.regex.Pattern;

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

			if (!Input.inputValid(new String(text), "[^`^]+$"))
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

			if (!Input.inputValid(new String(key), "^[A-Za-z]+$"))
				System.out.println("Invalid input. Try again.");
			else
				_AllowedToContinue = true;
		}

		return key;
	}

	private static boolean inputValid (String input, String regex)
	{
		boolean returnValue = true;

		final Pattern pattern = Pattern.compile(regex);
		if (!pattern.matcher(input).matches()) {
			returnValue = false;
		}

		return  returnValue;
	}

	private static String getString ()
	{
		Scanner scanner = new Scanner(System.in);

		return scanner.nextLine();
	}

	private static char[] getCharArray ()
	{
		return getString().toCharArray();
	}
}
