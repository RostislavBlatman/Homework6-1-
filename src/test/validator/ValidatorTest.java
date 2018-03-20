package test.validator;

import main.note.Note;

import main.validator.Validator;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    @Test
    public void validatorForEmptyNoteShouldReturn1(){
        Note[] note = new Note[1];
        note[note.length-1] = new Note();
        boolean a = Validator.empty(note);
        assertEquals(true, a);
    }

}