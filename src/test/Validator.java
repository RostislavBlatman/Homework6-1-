package test;

import main.note.Note;

public class Validator {
    public static void index (int currentIndex, int maxIndex) {
        if (currentIndex > maxIndex || currentIndex < 0) {
            throw new IndexOutOfBoundsException ("Introduced index is incorrect");
        }
    }
    public static int empty ( Note[] note ) {

        if (note[0].getNote() == null || note.length == 1 || note[0].getNote() == "") {

            System.out.println("\n\n\nOops,notepad is empty \nLet's add something ;)\n\n\n");

            return 1;
        }
        return 0;

    }


    }

