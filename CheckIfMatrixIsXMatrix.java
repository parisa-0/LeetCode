class Solution {
    public boolean checkXMatrix(int[][] grid) {
         for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                boolean primaryDiagonal = (i == j);
                boolean secondDiagonal = (j == grid.length - 1 - i);
                if ((primaryDiagonal || secondDiagonal) && grid[i][j] == 0) {
                    return false;
                } else if (!primaryDiagonal && !secondDiagonal && grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
/*
            boolean leftToRightDiagonalAreNonZero = IntStream.range(0, grid.length)
                .map(i -> grid[i][i])
                .allMatch(element -> element != 0);

        boolean rightToLeftDiagonalAreNonZero = IntStream.range(0, grid.length)
                .map(i -> grid[i][grid.length - 1 - i])
                .allMatch(element -> element != 0);

        boolean nonDiagoanlElementsAreZero = IntStream.range(0, grid.length)
                .flatMap(i -> IntStream.range(0, grid.length)
                .filter(j -> i != j && j != grid.length - 1 - i) 
                .map(j -> grid[i][j]))
                .allMatch(element -> element == 0);

       return leftToRightDiagonalAreNonZero && rightToLeftDiagonalAreNonZero && nonDiagoanlElementsAreZero;
       */
    }
}
