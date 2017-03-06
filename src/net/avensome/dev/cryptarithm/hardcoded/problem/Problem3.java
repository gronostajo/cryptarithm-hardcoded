package net.avensome.dev.cryptarithm.hardcoded.problem;

import java.util.HashSet;
import java.util.Set;

public class Problem3 extends Problem {
    private Set<Solution> solutions = new HashSet<>();
    private static final int[] RANGE = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Override
    public String getUnsolvedString() {
        return "abc + abc + abc = bbb";
    }

    @Override
    public void solve() {
        for (int a : RANGE) {
            for (int b : RANGE) {
                for (int c : RANGE) {
                        checkSolution(a, b, c);
                }
            }
        }
    }

    private void checkSolution(int a, int b, int c) {
        int left = 100 * a + 10 * b + c;
        int right = 100 * b + 10 * b + b;
        if (3 * left == right) {
            appendSolution(a, b, c);
        }
    }

    private void appendSolution(int a, int b, int c) {
        Solution newSolution = new Solution();
        newSolution.put("a", a);
        newSolution.put("b", b);
        newSolution.put("c", c);
        solutions.add(newSolution);
    }

    @Override
    public Set<Solution> getSolutions() {
        return solutions;
    }
}
