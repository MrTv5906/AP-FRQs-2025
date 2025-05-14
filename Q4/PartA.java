public SumOrSameGame(int numRows, int numCols){
        int[][] gameBoard = new int[numRows][numCols];
        for(int i = 0; i < gameBoard.length){
            for(int j = 0; j < gameBoard[0].length){
                gameBoard[i][j] = (int)(math.Random()*10+1);
            }
        }
    }
