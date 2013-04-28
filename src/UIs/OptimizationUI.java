package UIs;

import java.util.ArrayList;

import exceptions.InputException;

import solutions.Solution;
import problems.OptimizationProblem;
import UIs.*;

public abstract class OptimizationUI {
    
    public OptimizationUI() {
    }
    
    public abstract String getVariableInput(String varName);
    public abstract void printSolution(Solution solution);
    
    public Double getDoubleInput(String varName) throws InputException {
        String s = getVariableInput(varName);
        try {
            return Double.parseDouble(s);
        }
        catch(NumberFormatException e) {
            throw new InputException(varName, "is not a double");
        }
    }

}
