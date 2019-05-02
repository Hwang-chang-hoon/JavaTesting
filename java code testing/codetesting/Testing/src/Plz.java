
public class Plz {

	public static void main(String[] args) {
		private int matrix[][]  = null;    
		 
	    private int[][] emptyEasy = {
	            {0},
	            {0},
	            {0}
	    };
	 
	    private int[][] emptyNormal = {
	            {0},
	            {0},
	            {0},
	            {0}
	    };
	 
	    private int[][] emptyHard = {
	            {0},
	            {0},
	            {0},
	            {0},
	            {0}
	    };
	 
	    private int[][] getEmpty(int level) {
	        switch (level) {
	            case IntroViewModel.EASY:
	                return emptyEasy;
	            case IntroViewModel.NORMAL:
	                return emptyNormal;
	            case IntroViewModel.HARD:
	                return emptyHard;
	            default:
	                return null;
	        }
	    }
	 
	    private int[][] verticalShuffle(int[][] matrix, int level) {
	        int[][] tmp = getEmpty(level);
	        if (tmp != null) {
	            int vertical = tmp.length;
	            for (int i = 0; i < vertical; i++) {
	                int r = i + (int) (Math.random() * (vertical - i));
	                int r2 = i + (int) (Math.random() * (vertical - i));
	                for (int j = 0; j < vertical; j++) {
	                    tmp[j][0] = matrix[j][r];
	                    matrix[j][r] = matrix[j][r2];
	                    matrix[j][r2] = tmp[j][0];
	 
	            }
	 
	            }
	        }
	        return matrix;
	    }


	

	}

}
