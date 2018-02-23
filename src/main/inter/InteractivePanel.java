package main.inter;

import main.note.Notepad;


import java.util.Scanner;

public class InteractivePanel {

        Notepad notepad = new Notepad();
        Scanner num = new Scanner(System.in);

    public void greeting () {
        System.out.println("The program 'My notepad' welcomes you");
        System.out.println("Select command:\n1 - add note\n" +
                "2 - delete note\n3 - editing\n4 - output on display\n5 - quit");

        int code = num.nextInt();

        switch (code){
            case 1:
                System.out.print("Introduce your note: ");
                String str = num.next();
                notepad.add(str);
                greeting();
                break;

            case 2:
                System.out.println("Choose note for deleting:");
                notepad.showAll();
                int line = num.nextInt();
                notepad.delete(line);
                System.out.println("-----Records has been updated-----\n\n\n");
                greeting();
                break;

            case 3:
                System.out.println("What note you want editing?\n");
                notepad.showAll();
                line = num.nextInt();
                System.out.println("Introduce new note: ");
                str = num.next();
                notepad.edit(line,str);
                System.out.println("-----Records has been updated-----\n\n\n");
                notepad.showAll();
                greeting();
                break;

            case 4:
                notepad.showAll();
                greeting();
                break;

            case 5:
                break;

            default:
                System.out.println("Introduce command from 1 to 5");
                greeting();
                break;
        }

    }


}

