import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars, spaces;
        for (int lineNum = 0; lineNum < 2*n; lineNum++){
            if (lineNum <= n){
                stars = lineNum;
                spaces = 2*(n - lineNum);
            } else {
                stars = 2*n - lineNum;
                spaces = 2*(n - stars);
            }
            System.out.print("*".repeat(stars));
            System.out.print(" ".repeat(spaces));
            System.out.println("*".repeat(stars));
        }
    }
}