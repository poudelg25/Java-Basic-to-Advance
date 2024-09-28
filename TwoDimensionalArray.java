import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // Array Declaration -> datatype[row][column] array_name;
        // datatype [row][column]array_name;
        // datatype array_name[row][column];
        int[][] values;

        // Instantiate -> row size is mandatory, but column size is optional
        // values= new int[2][];
        values = new int[2][3];

        //Initialize
        values[0][0] = 7;
        values[1][2] = 10;
        values[0][2] = 67;

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        // How to print the numbers above in the form of matrix?
        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("#########");
        // Finding sum of two-dimensional matrix
        int sum = 0;
        for(var i=0; i<3; i++){
            for(var j=0; j<4; j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum of the matrix is: "+sum);


        System.out.println("#########");
        // Finding max values from two-dimensional array
        int max = matrix[0][0];
        int indexRowMax = 0;
        int indexColumnMax =0;
        for(var i=0; i<matrix.length; i++){ //length of rows
            for(var j=0; j<matrix[i].length; j++){//length of column
                if(matrix[i][j]> max){
                    max = matrix[i][j];
                    indexRowMax = i;
                    indexColumnMax = j;
                }
            }
        }

        System.out.println();
        System.out.println("The max value: "+max+" found at index : ["+indexRowMax+"] ["+ indexColumnMax +"] in two-dimensional array.");
        // Finding min value from two-dimensional array
        int min =matrix[0][0];
        int indexRowMin=0;
        int indexColumnMin=0;
        for(var i=0; i<matrix.length; i++){
            for(var j=0; j<matrix[i].length; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    indexRowMin = i;
                    indexColumnMin = j;
                }
            }
        }

        System.out.println();
        System.out.println("The min value: "+min+" found at index : ["+indexRowMin+"] ["+ indexColumnMin +"] in two-dimensional array.");

        // To print all elements of the single row from the two-dimensional array
        System.out.println();
        System.out.println("All elements of the single row from two-dimensional array of row zero: "+(Arrays.toString(matrix[0])));
    }

}
