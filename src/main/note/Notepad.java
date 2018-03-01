package main.note;


import main.validator.Validator;

import java.util.Arrays;


public class Notepad {
    private int counter;
    final static private int START_SIZE = 5;

    {
        counter = 0;
    }

    private Note[] note;

    public Notepad() {
        note = new Note[START_SIZE];
        init();
    }

    public Note[] getNote() {
        return note;
    }

    private void init() {

        for (int currentLine = 0; currentLine < 2; currentLine++) {
            note[currentLine] = new Note();
        }
    }

    public void add(String str) {

        note[counter].setNote(str);
        if (note.length / (counter + 1) < 1.5) {
            note = Arrays.copyOf(note, note.length * 2);
        }
        counter++;
        note[counter] = new Note();
        System.out.println(" Note \"" + note[counter - 1].getNote() + "\" has been added in your notepad ");
        System.out.println("\n\n\n\n\n");

    }

    public void delete(int line) {

        Validator.index(line, note.length - 1);
        if (Validator.empty(note) == 1) {
            System.out.println("Notepad is empty! Let's add something");
        } else {
            counter--;
            if (counter <= 0) {
                note = new Note[START_SIZE];
                init();
                System.out.println("\n\n\n Oops,notepad is empty \nLet's add something ;)\n\n\n");
            } else {
                if (note.length / (counter + 1) > 3) {
                    note = Arrays.copyOf(note, note.length / 2);
                }


                for (int currentLine = line + 1; currentLine <= counter; currentLine++) {
                    note[currentLine - 1] = note[currentLine];
                }
                note[counter] = new Note();
                showAll();
            }
        }

    }

    public void edit(int line, String str) {

        Validator.index(line, note.length - 1);
        note[line].setNote(str);
    }

    public void showAll() {
        if (Validator.empty(note) != 1) {

            System.out.println("My notepad: ");
            for (int noteIndex = 0; noteIndex < counter; noteIndex++) {
                System.out.println(noteIndex + ": " + note[noteIndex].getNote());
            }
            System.out.println("\n\n\n");
        }
    }


}

