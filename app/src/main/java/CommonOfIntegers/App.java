/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CommonOfIntegers;

import java.util.ArrayList;

public class App{
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    public static int getCommon(ArrayList<Integer> inputs, int number1, int number2, int number3) {
        int common;
        int value = number1*number2*number3;

        if(inputs == null) return -1;
        if(inputs.size() == 0) return -1;

        for(int i=0; i<inputs.size(); i++){
            common = inputs.get(i);
            if(inputs.get(i) % value == 0)
                return common;
        }
        return -1;
    }
}
