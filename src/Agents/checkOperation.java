package Agents;

import jade.core.Agent;

public class checkOperation extends Agent {
    public static int firstNumber;
    public static int secondNumber;
    @Override
    protected void setup() {
        super.setup();
        Object[] myData = getArguments();
        firstNumber = (int) myData[0];
        secondNumber = (int)myData[1];
        String operation = (String)myData[2];
        switch (operation) {
            case "+" :
                addBehaviour(new Behaviour.doSummation());
                break;
            case "-" :
                addBehaviour(new Behaviour.doSubtraction());
                break;
            case "*" :
                addBehaviour(new Behaviour.doMultiplication());
                break;
            case "/" :
                addBehaviour(new Behaviour.doDivision());
                break;
            case "%" :
                addBehaviour(new Behaviour.doModulo());
                break;
        }
    }
}
