import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StaleProxyException {


        // Creating main container
        Runtime runtime = Runtime.instance();
        ContainerController mainContainer = runtime.createMainContainer(new ProfileImpl("localhost", 1000, "AISummation"));

//        AgentController rma = mainContainer.createNewAgent("rma", "jade.tools.rma.rma", null);
//        rma.start();

        // Getting numbers from user
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to AI Calculation..!");
        System.out.println("Enter the first number : ");
        int firstNumber = in.nextInt();
        System.out.println("Enter the second number : ");
        int secondNumber = in.nextInt();
        System.out.println("Enter the operation : ");
        String operation = in.next();
        Object[] data = {firstNumber, secondNumber, operation};
        // End getting numbers from user

        AgentController checkOperation = mainContainer.createNewAgent("Operation", "Agents.checkOperation", data);
        checkOperation.start();
        // End creating main container


    }
}