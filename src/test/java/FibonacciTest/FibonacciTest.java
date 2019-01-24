package FibonacciTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    private Fibonacci customFibonacci = new Fibonacci();

    @Test
    public void testIf3thNumberFibonacciNrIsAFibonacciNumber() {
        {
            int a = 3;
            int valueOfElementUsingIndex = customFibonacci.findFibonacciNrs().get(a);
            //valueOfElementUsingIndex = 200; <- test returns false if i remove "//"
            System.out.println("3thFibonacciNrTest result ->" +customFibonacci.findFibonacciNrs().contains(valueOfElementUsingIndex));
        }
    }

    @Test
    public void testIf5thNumberFibonacciNrIsAFibonacciNumber() {
        {
            int a = 5;
            int valueOfElementUsingIndex = customFibonacci.findFibonacciNrs().get(a);
            //valueOfElementUsingIndex = 200; <- test returns false if i remove "//"
            System.out.println("5thFibonacciNrTest result ->" +customFibonacci.findFibonacciNrs().contains(valueOfElementUsingIndex));
        }
    }
    @Test
    public void testIf8thNumberFibonacciNrIsAFibonacciNumber() {
        {
            int a = 8;
            int valueOfElementUsingIndex = customFibonacci.findFibonacciNrs().get(a);
            //valueOfElementUsingIndex = 200; <- test returns false if i remove "//"
            System.out.println("8thFibonacciNrTest result ->" +customFibonacci.findFibonacciNrs().contains(valueOfElementUsingIndex));
        }
    }

    @Test
    public void testIf3thFibonacciNrIsAFibonacciNumberUsingRecursiveMethod() {
        {
            int a = 3;
            int value = customFibonacci.findFibonaccinrsRecursive(a);
            //value = 200; <- test returns false if i remove "//"
            System.out.println("3thFibonacciNrRecursiveTest result ->" + customFibonacci.findFibonacciNrs().contains(value));
        }
    }

    @Test
    public void testIf5FibonacciNrIsAFibonacciNumberUsingRecursiveMethod() {
        {
            int a = 5;
            int value = customFibonacci.findFibonaccinrsRecursive(a);
            //value = 200; <- test returns false if i remove "//"
            System.out.println("5thFibonacciNrRecursiveTest result ->" + customFibonacci.findFibonacciNrs().contains(value));
        }
    }

    @Test
    public void testIf8thFibonacciNrIsAFibonacciNumberUsingRecursiveMethod() {
        {
            int a = 8;
            int value = customFibonacci.findFibonaccinrsRecursive(a);
            //value = 200; <- test returns false if i remove "//"
            System.out.println("8thFibonacciNrRecursiveTest result ->" + customFibonacci.findFibonacciNrs().contains(value));

        }
    }
}
