import java.util.Scanner;

public class HanoiTower{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of the disks:");
        int n=scanner.nextInt();
        System.out.println("The moves are:");
        moveDISKs(n,'A','B','C');
    }
    public static void moveDISKs(int n,char fromTower,char auxTower,char toTower){
        if(n==1) System.out.println("move disk 1 form "+fromTower+" to "+toTower);
        else{
            moveDISKs(n-1,fromTower,toTower,auxTower);
            System.out.println("move disk "+n+" from "+fromTower+" to "+toTower);
            moveDISKs(n-1,auxTower,fromTower,toTower);
        }
    }
}