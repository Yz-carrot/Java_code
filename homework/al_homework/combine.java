package al_homework;

import java.util.Scanner;

public class combine {
    private static int t;
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int r=scanner.nextInt();
        t=r;
        int []a=new int[r];
        combines(n,r,a);
}
    public static void combines(int n,int r,int []a){
        if(n==r){
            for(int i=0;i<r;i++) a[i]=i+1;
            for(int i=t-1;i>=0;i--) {System.out.print(a[i]);}
            System.out.println();
        }
        else if(r==0){
            for(int i=t-1;i>=0;i--) System.out.print(a[i]);
            System.out.println();
        }
        else{
            a[r-1]=n;
            combines(n-1,r-1,a);
            combines(n-1,r,a);
        }
    }
}