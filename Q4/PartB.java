public boolean clearPair(int row, int col){
        int first = puzzle[row][col];
        for(int i = row; i < puzzle.length; i++){
            for(int j = 0; j < puzzle.length[0]; i++){
                int second = puzzle[i][j];
                if(i == row && j == col){
                }
                if((first == second) || (first + second == 10)){
                    first == 0;
                    second == 0;
                    return true;
                }
            }
            return false;
        }
    }
