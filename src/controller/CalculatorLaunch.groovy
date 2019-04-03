package controller

import view.CalculatorView

class CalculatorLaunch {
    static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorView view = new CalculatorView();

        String operation = view.inputOperation();

        int value1 = view.inputValue();
        int value2 = view.inputValue();

        int result = calculator.calc(value1, value2, operation);

        view.printResult(result);
    }
}
