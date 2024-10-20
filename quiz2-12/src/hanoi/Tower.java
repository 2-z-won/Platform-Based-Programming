package hanoi;

public class Tower {
    private int n;
    private int moves;

    public Tower(int n){
        this.n = n;
        this.moves = 0;
    }

    public void print(){
        moves = (int) Math.pow(2,n) - 1;
        System.out.println(moves);

        if(n<=20){
            hanoi(n, 1, 3, 2);
        }
    }

    private void hanoi(int disks, int start, int end, int temp){
        if (disks == 1){
            System.out.println(start + " " + end);
            return;
        }
        hanoi(disks - 1, start, temp, end);
        System.out.println(start + " " + end);
        hanoi(disks -1 , temp, end, start);
    }
}
