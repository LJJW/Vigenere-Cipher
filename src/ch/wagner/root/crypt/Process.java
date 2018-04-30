package ch.wagner.root.crypt;

import java.util.regex.Pattern;

public class Process
{
	public static String decrypt(char[] text, char[] key)
	{
		int[] shift = new int[key.length];

		key = new String(key).toUpperCase().toCharArray();

		for (int i = 0; i < shift.length; i++)
			shift[i] = key[i] - 65;

		int ii = 0;
		for (int i = 0; i < text.length; i++)
		{
			if (ii == shift.length)
				ii = 0;

			if (Character.isLetter(text[i]))
			{
				if (((((text[i] - 65) - shift[ii]) % 26) + 65) < 65)
					text[i] = (char) (((((text[i] - 65) - shift[ii]) % 26) + 65) + 26);
				else
					text[i] = (char) ((((text[i] - 65) - shift[ii]) % 26) + 65);
			}
			ii++;
		}

		return new String(text);
	}

	public static String encrypt(char[] text, char[] key)
	{
		int[] shift = new int[key.length];

		key = new String(key).toUpperCase().toCharArray();

		for (int i = 0; i < shift.length; i++)
		{
			shift[i] = key[i] - 65;
		}

		text = new String(text).replaceAll("[^a-zA-Z0-9|/()*]+", "").toCharArray();

		int ii = 0;
		for (int i = 0; i < text.length; i++)
		{
			if (ii == shift.length)
				ii = 0;

			text[i] = Character.toUpperCase(text[i]);

			if (Character.isLetter(text[i]))
				text[i] = (char)((((text[i] - 65) + shift[ii]) % 26) + 65);
			ii++;
		}

		return new String(text);
	}
}