package view

class CalculatorView {
    Scanner input = new Scanner(System.in);

    int inputValue() {
        print("Enter value: ");
        int value = input.nextInt();

        return value;
    }

    void printResult(int result) {
        println("Result: $result");
    }

    String inputOperation() {
        String operation

        print("""1 - SUM
2 - SUBTRACTION
3 - MULTIPLICATION
4 - DIVISION
Enter the number for the operation:""");

        int value = input.nextInt();

        switch (value) {
            case 1:
                operation = 'SUM';
                break;
            case 2:
                operation = 'SUBTRACTION';
                break;
            case 3:
                operation = 'MULTIPLICATION';
                break;
            case 4:
                operation = 'DIVISION';
                break;
            default:
                operation = null;
                break;
        }

        return operation;

    }
}
