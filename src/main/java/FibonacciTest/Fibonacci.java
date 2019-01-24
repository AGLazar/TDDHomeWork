package FibonacciTest;

import java.util.LinkedList;

public class Fibonacci {

    private LinkedList<Integer> myFibonacciNrList = new LinkedList<Integer>();


    //nonrecursive method
    public LinkedList<Integer> findFibonacciNrs() {
        int a = 0;
        int b = 1;
        int sum = a + b;
        myFibonacciNrList.add(0);
        myFibonacciNrList.add(1);

        for (int i = 0; i < 50; i++) {
            a = b;
            b = sum;
            sum = a + b;
            myFibonacciNrList.add(sum);

        }
        return myFibonacciNrList;
    }

    //recursive method
    public int findFibonaccinrsRecursive(int n) {

        if (n >= 0 && n <= myFibonacciNrList.size()) {
            return myFibonacciNrList.get(n) + findFibonaccinrsRecursive(n-1) ;
        } else
            return 0;
    }


}
