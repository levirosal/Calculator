package controller

import model.Division
import model.Multiplication
import model.Operations
import model.Subtraction
import model.Sum

class Calculator {

    int calc(int valueOne, int valueTwo, String operation) {
        Operations op;

        if (operation == 'SUM') {
            op = new Sum();
        } else if (operation == 'SUBTRACTION') {
            op = new Subtraction();
        } else if (operation == 'MULTIPLICATION') {
            op = new Multiplication();
        } else if (operation == 'DIVISION') {
            op = new Division();
        }
        int result = op.calculate(valueOne, valueTwo);

        return result;
    }

}
