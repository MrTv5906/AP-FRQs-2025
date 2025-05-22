public SumOrSameGame(int numRows, int numCols){
        int[][] puzzle = new int[numRows][numCols];
        for(int i = 0; i < puzzle.length){
            for(int j = 0; j < puzzle[0].length){
                puzzle[i][j] = (int)(Math.random()*10+1);
            }
        }
    }
