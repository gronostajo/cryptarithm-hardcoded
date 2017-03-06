package net.avensome.dev.cryptarithm.hardcoded.problem;

import java.util.HashSet;
import java.util.Set;

public class Problem2 extends Problem {
    private Set<Solution> solutions = new HashSet<>();
    private static final int[] RANGE = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Override
    public String getUnsolvedString() {
        return "klm + klm = nkl";
    }

    @Override
    public void solve() {
        for (int k : RANGE) {
            for (int l : RANGE) {
                for (int m : RANGE) {
                    for (int n : RANGE) {
                        checkSolution(k, l, m, n);
                    }
                }
            }
        }
    }

    private void checkSolution(int k, int l, int m, int n) {
        int left = 100 * k + 10 * l + m;
        int right = 100 * n + 10 * k + l;
        if (2 * left == right) {
            appendSolution(k, l, m, n);
        }
    }

    private void appendSolution(int k, int l, int m, int n) {
        Solution newSolution = new Solution();
        newSolution.put("k", k);
        newSolution.put("l", l);
        newSolution.put("m", m);
        newSolution.put("n", n);
        solutions.add(newSolution);
    }

    @Override
    public Set<Solution> getSolutions() {
        return solutions;
    }
}
