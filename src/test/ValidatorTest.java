package test;

import main.note.Note;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    @Test
    public void validatorForEmptyNoteShouldReturn1(){
        Note[] note = new Note[1];
        note[note.length-1] = new Note();
        int a = Validator.empty(note);
        assertEquals(1, a);
    }

}