import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int[][] matrix = new int[a][b];

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++){
                matrix[i][j] = 0;
            }
        }

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String[] coordinates = sc.next().split(" ");

        }
    }
}