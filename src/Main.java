public class Main {
    public static void main(String[] args){
        Matrix matrix1 = new Matrix(3, 4);
//        int [][] inputMatrix = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
//        matrix1.resetRandomMatrix();
//        matrix1.resetMatrix(inputMatrix);
        Matrix matrix2 = new Matrix(3, 4);
        matrix1.addMatrix(matrix2);

    }
}
