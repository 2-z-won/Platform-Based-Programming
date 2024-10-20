import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SidePegsTower tower = new SidePegsTower(n);
        System.out.println(tower.move());
    }
}