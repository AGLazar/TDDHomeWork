package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CustomStack {
    private String val;
    private Stack<String> myStack = new Stack<String>();


    public boolean isEmpty() {
        if( myStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String peek() {
         myStack.peek();
         return myStack.peek();
    }

    public String pop() {

        return myStack.pop();
    }

    public String add(String val) {
         myStack.push(val);
         return val;
    }

    public int search(String val) {
        int index = 0;
        for (int i = 0; i <myStack.size() ; i++) {
            if( val.equals(myStack.elementAt(i))){
                index = i;
            } else {
                index = -1;
            }
        } return index;
    }
}

