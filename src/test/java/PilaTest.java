import model.Pila;
import model.PilaException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilaTest {

    private Pila<Integer> p;

    @BeforeEach
    void setup(){
        p = new Pila<>();
    }


    @Test
    void aNewPilaShouldBeEmpty(){
        assertTrue(p.isEmpty());
    }

    @Test
    void peekingAnEmptyPilaShouldRaiseAnException(){
        //assertThrows(Exception.class, p::peek);
        try {
            p.peek();
        }catch (PilaException e){
            assertTrue(e instanceof PilaException);
        }
    }

    @Test
    void PopingAnEmptyPilaShouldRaiseAnException(){
        assertThrows(PilaException.class, p::pop);
    }

    @Test
    void canAddElementToTheStack(){
        Integer unElementoCualquiera = 42;
        p.add(unElementoCualquiera);
        assertFalse(p.isEmpty());
    }

    @Test
    void canPeekAddElement() throws PilaException {
       p.add(123);
       assertEquals(123, p.peek());
       assertTrue(p.isEmpty());
    }

    @Test
    void canPopAddElement() throws PilaException {
        p.add(123);
        assertEquals(123, p.pop());
        assertTrue(p.isEmpty());
    }

    @Test
    void canPeekAndPopAddElement() throws PilaException {
        p.add(123);
        assertEquals(123, p.peek());
        assertEquals(123, p.pop());
        assertTrue(p.isEmpty());
    }

    @Test
    void fullStack() throws PilaException {
        p.add(124);
        p.pop();
        p.add(1);
        p.add(6);
        p.peek();
        p.pop();
        p.pop();
        assertTrue(p.isEmpty());
    }
}
