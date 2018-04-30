# Vigenere-Cipher
This program encrypts your text using the key you entered with the Vigenere Cipher. The encryption process is a modified version of the Caesar Cipher I did about half a year ago. Insted of the shift staying the same for the whole process, it constantly changes according to the keyword. [Here you can read more about the Vigenere Cipher](https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher). The main methods are `.getText()`, `.getKey()`, `.getDecryptedText` and `.getEncryptedText`.
`.getText()` and `.getKey()` mainly write a promp to enter key and text to the command line and check if the input is valid according to a RegEx check. Their return values are what the user entered in the format of char arrays.
`.getDecryptedText` and `.getEncryptedText` do pretty much what they say. They expect the arguments key and text in an bot in a char array. They both return the encrypt/decrypted text as a String. 
