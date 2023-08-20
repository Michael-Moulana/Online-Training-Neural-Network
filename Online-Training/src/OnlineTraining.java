import java.util.ArrayList;

public class OnlineTraining {
	double threshold = 6;	
	private double[][] weights = {{0.4, -1.5, 0.7}};
	private double[][] inputData = {
	        {0, 0, 1},
	        {0, 1, 0},
	        {0, 1, 1},
	        {1, 0, 0},
	        {1, 0, 1},
	        {1, 1, 0},
	        {1, 1, 1}
	    };
	
	double[] targetOutputs;
    double error = 10;
    // Eta
    double learningRate = 0.1;
    
	public OnlineTraining(double[] output) {
		targetOutputs   = output;
	}
	
	public void train() {
		double y;
		while(error>0) {
			error = 0;
			for (int i = 0; i < inputData.length; i++) {
				y = multiply(inputData, weights, i);
				if (y >= threshold) {
					y = 1;
				}else {
					y = 0;
				}
				if (y != targetOutputs[i]) {
					threshold = threshold - learningRate*(targetOutputs[i]-y);
					weights = addition(weights, deltaW(y, i));
					error = error + Math.abs(targetOutputs[i]-y);
				}
			}
			
		}
	}
	private double multiply(double[][] matrixOne, double[][] matrixTwo, int rowIndex) {
        double[][] product = new double[matrixOne.length][matrixTwo[0].length];
		//fills output matrix with 0's
        for(int l = 0; l<matrixOne.length; l++) {
            for(int m = 0; m<matrixTwo[0].length; m++) {
                product[l][m] = 0;
            }
        }
        matrixTwo = transpose(matrixTwo);
		//takes the dot product of the rows and columns and adds them to output matrix
        for(int j = 0; j<matrixTwo[0].length; j++) {
            for(int k = 0; k<matrixOne[0].length; k++) {
                product[rowIndex][j] += matrixOne[rowIndex][k] * matrixTwo[k][j];
            }
        }
        return product[rowIndex][0];
    }
	public double[][] deltaW(double y1, int i){
		// (eta*(o[i]-y))*x(i,:)
		double[][] result = new double[weights.length][weights[0].length];
		for (int row = 0; row < result.length; row++) {
			for (int col = 0; col < result[0].length; col++) {
				result[row][col] = learningRate*(targetOutputs[i]-y1)*inputData[i][col];
			}
		}
		return result;
	}
	public double[][] addition(double[][] matrixOne, double[][] matrixTwo) {
		double[][] result = new double[matrixOne.length][matrixOne[0].length];
		for (int row = 0; row < result.length; row++) {
			for (int col = 0; col < result[0].length; col++) {
				result[row][col] = matrixOne[row][col] + matrixTwo[row][col];
			}
		}
		return result;
	}
	public double[][] transpose(double[][] matrix){
		double[][] transposed = new double[matrix[0].length][matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
			    transposed[col][row] = matrix[row][col];
			 }
		}
		return transposed;
	}
}
