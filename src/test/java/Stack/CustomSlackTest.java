package Stack;

import Stack.CustomStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomSlackTest {
    private CustomStack customStack;

    @Before
    public void initStack(){
        customStack = new CustomStack();
    }

    @Test
    public void testIfTheStackEmptyReturnsTrue(){
        assertEquals(true, customStack.isEmpty());
    }

    @Test
    public void returnsTheTopObjectPeek(){
        customStack.add("Cartea1-Algebra");
        customStack.peek();
    }

    @Test
    public void returnsDeletedElementFromTheStackWhenWeUseTheMethodPop(){
        customStack.add("Cartea2-LordOfTheRings");
        customStack.add("Cartea3-GameOfThrones");
        customStack.pop();
    }

    @Test
    public void addAnElementToTheTopOfTheStackAndRetunIt(){
        customStack.add("Cartea4-LimbaJaponeza");
    }

    @Test
    public void searchIfElementIsInTheStackAndReturnsIndexIfItIsThere(){
        customStack.add("JavaForDummies");
        customStack.add("TheBible");
        customStack.add("TibetanBookOfTheDead");
        customStack.search("TibetanBookOfTheDead");
    }

}
