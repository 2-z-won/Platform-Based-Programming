import java.util.*;
import java.util.List;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        List<Integer> theList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    while (true){
        String[] command = sc.nextLine().split(" ");

        if(command[0].equals("ADD")){
            int num = Integer.parseInt(command[1]);

            if(theList.contains(num)){
                System.out.println("The Same Number");
            } else {
                theList.add(num);
            }
        } else if (command[0].equals("LIST")){
            int sizeOfList = theList.size();
            for (int i=0; i<sizeOfList; i++){
                System.out.print(theList.get(i) + " ");
            }
            System.out.println(" ");

        } else if (command[0].equals("SUM")) {
            int sum = 0;
            int sizeOfList = theList.size();
            for (int i = 0; i<sizeOfList; i++){
                sum += theList.get(i);
            }
            System.out.println(sum);

        } else if (command[0].equals("MAX")) {
            System.out.println(Collections.max(theList));

        } else if (command[0].equals("MIN")) {
            System.out.println(Collections.min(theList));

        } else if (command[0].equals("AVG")) {
            int sizeOfList = theList.size();
            int sum = 0;
            for (int i = 0; i<sizeOfList; i++){
                sum += theList.get(i);
            }
            System.out.println((double) sum/sizeOfList);

        } else if (command[0].equals("QUIT")) {
            System.out.println("Bye");
            exit(0);
        } else {
            System.out.println("Invalid Command");
        }
    }
    }
}