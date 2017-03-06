package net.avensome.dev.cryptarithm.hardcoded.problem;

import java.util.HashSet;
import java.util.Set;

public abstract class Problem {
    protected Set<Solution> solutions = new HashSet<>();
    protected static final int[] RANGE = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public abstract String getUnsolvedString();
    public abstract void solve();

    public Set<Solution> getSolutions() {
        return solutions;
    }
}
