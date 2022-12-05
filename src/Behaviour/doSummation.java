package Behaviour;

import Agents.checkOperation;
import jade.core.behaviours.Behaviour;

public class doSummation extends Behaviour {
    @Override
    public void action() {
        int fNumber = checkOperation.firstNumber;
        int sNumber = checkOperation.secondNumber;
        int result = fNumber + sNumber;
        System.out.println("The summation is : " + result);
    }

    @Override
    public boolean done() {
        return true;
    }
}
