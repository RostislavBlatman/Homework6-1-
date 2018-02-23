/**
 *
 * Program "My notepad"
 * It is intended for adding, deleting, editing and outputting records from an array of notes created in the process
 * work program.
 * Разбита на три класса: Main - main class, InteractivePanel, Note , Notepad - class with logic,
 * Validator - class-validator.
 * When starting, the user is given a choice of 5 functions:
 * 1 - adding note;
 * 2 - deleting note;
 * 3 - editing;
 * 4 - outputting on display;
 * 5 - quit           .
 * When you choose command:
 * 1 - Your note is placed at the end of the array and it is incremented by 1;
 * 2 - The note you selected is deleted and the array is reduced by 1;
 * 3 - The entry you selected is replaced with a new entry that was entered immediately after the prompt for the entry;
 * 4 - Outputs all records currently available;
 * 5 - closes the application.
 * @author Rostislav Blatman
 * @version 0.2
 *
 */
package main;

import main.inter.InteractivePanel;

public class Main {
    public static void main(String[] args) {
        InteractivePanel a = new InteractivePanel();
        a.greeting();
    }
}
