package Behaviour;

import Agents.checkOperation;
import jade.core.behaviours.Behaviour;

public class doDivision extends Behaviour {
    @Override
    public void action() {
        int fNumber = checkOperation.firstNumber;
        int sNumber = checkOperation.secondNumber;
        try {
            int result = fNumber / sNumber;
            System.out.println("The division is : " + result);
        }catch (ArithmeticException arithmeticException) {
            System.out.println("Error : " + arithmeticException.getMessage());
        }
    }

    @Override
    public boolean done() {
        return true;
    }
}
