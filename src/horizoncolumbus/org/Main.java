package horizoncolumbus.org;

public class Main {

    public static void main(String[] args) {
        int matrix[][] = {{0, 1, 1},{9, 2, 4}, {9, 0, 4}};

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" = " + sum);
            System.out.println();

        }
    }

    }

