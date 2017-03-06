package net.avensome.dev.cryptarithm.hardcoded;

import net.avensome.dev.cryptarithm.hardcoded.problem.*;

import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Problem problem = new Problem1();
//        Problem problem = new Problem2();
//        Problem problem = new Problem3();
        problem.solve();
        printSolutions(problem.getUnsolvedString(), problem.getSolutions());
    }

    private static void printSolutions(String unsolvedString, Set<Solution> solutions) {
        System.out.format("%d solutions found!\n", solutions.size());
        for (Solution solution : solutions) {
            System.out.println(solutionToString(unsolvedString, solution));
        }
    }

    private static String solutionToString(String unsolvedString, Solution solution) {
        String output = unsolvedString.toLowerCase();
        for (Map.Entry<String, Integer> variable : solution.entrySet()) {
            String variableName = variable.getKey().toLowerCase();
            output = output.replaceAll(variableName, variable.getValue().toString());
        }
        return output;
    }
}
