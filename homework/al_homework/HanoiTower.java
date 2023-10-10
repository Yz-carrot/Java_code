package homework.al_homework;

import java.util.Scanner;

public class HanoiTower {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give the number of the disks:");
        int n = scanner.nextInt();
        System.out.println("The moves are:");
        MoveDisks(n,'A','B','C');
    }
    public static void MoveDisks(int n,char fromTower,char auxTower,char toTower){
        if(n==1) System.out.println("Move disk 1 from "+fromTower+" to "+toTower);
        else{
            MoveDisks(n-1,fromTower,toTower,auxTower);
            System.out.println("Move disk "+n+" from "+fromTower+" to "+toTower);
            MoveDisks(n-1,auxTower,fromTower,toTower);
        }
    }
}
