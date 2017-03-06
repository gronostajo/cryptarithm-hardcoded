package net.avensome.dev.cryptarithm.hardcoded.problem;

public class Problem1 extends Problem {
    @Override
    public String getUnsolvedString() {
        return "def + fef = ghh";
    }

    @Override
    public void solve() {
        for (int d : RANGE) {
            for (int e : RANGE) {
                for (int f : RANGE) {
                    for (int g : RANGE) {
                        for (int h : RANGE) {
                            checkSolution(d, e, f, g, h);
                        }
                    }
                }
            }
        }
    }

    private void checkSolution(int d, int e, int f, int g, int h) {
        int left1 = 100 * d + 10 * e + f;
        int left2 = 100 * f + 10 * e + f;
        int right = 100 * g + 10 * h + h;
        if (left1 + left2 == right) {
            appendSolution(d, e, f, g, h);
        }
    }

    private void appendSolution(int d, int e, int f, int g, int h) {
        Solution newSolution = new Solution();
        newSolution.put("d", d);
        newSolution.put("e", e);
        newSolution.put("f", f);
        newSolution.put("g", g);
        newSolution.put("h", h);
        solutions.add(newSolution);
    }
}
