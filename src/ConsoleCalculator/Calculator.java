package ConsoleCalculator;

import java.util.Scanner;

public class Calculator {

    /**
     * Creates scanner from savin entry messages from user
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        /**
         * Infinite loop as long as bool stays true
         */
        while (running) {

            System.out.println("Wähle eine Operation (+), (-), (*), (/) (exit): ");
            String choice = scanner.next();

            if (choice.equals("exit")) {
                running = false;
                break;
            }

            /**
             * Saving the entry numbers
             */
            System.out.println("Bitte gib eine Zahl ein: ");
            Double number1 = scanner.nextDouble();

            System.out.println("Bitte gib eine zweite Zahl ein: ");
            Double number2 = scanner.nextDouble();


            /**
             * if the user entered an acceptable choice for his calculation, an operation based on the choice will be created
             * the operation is going to be executed with the two numbers and is printed out on the screen
             * if illegal entries are submitted and error message will be shown
             */
            OperationFactory factory = getOperationFactory(choice);
            if (factory != null) {
                Operation operation = factory.createOperation();
                try {
                    double result = operation.execute(number1, number2);
                    System.out.println("Ergebnis: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Ungültige Operation.");
            }


        }

        System.out.println("Taschenrechner beendet.");

    }

    /**
     * switch method for deciding what the right factory is based on the users entry
     * @param operation
     * @return
     */
    private static OperationFactory getOperationFactory (String operation){
                switch (operation) {
                    case "+":
                        return new AdditionFactory();
                    case "-":
                        return new SubtractionFactory();
                    case "*":
                        return new MultiplicationFactory();
                    case "/":
                        return new DivisionFactory();

                    default:
                        return null;
                }

            }

        }
