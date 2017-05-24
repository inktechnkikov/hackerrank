package ReverseDiagonal;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int ar[][]=inputMatrix();
        displayMatrix(ar);

        for(int i=0;i<ar.length/2;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                if(i==j)
                {
                    int t=ar[i][j];
                    ar[i][j]=ar[ar.length-1-i][ar.length-1-j];
                    ar[ar.length-1-i][ar.length-1-j]=t;
                }
                if(i+j==ar.length-1)
                {
                    int t=ar[i][j];
                    ar[i][j]=ar[j][i];
                    ar[j][i]=t;
                }
            }
        }
        displayMatrix(ar);
    }
    static void displayMatrix(int[][] ar){
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] inputMatrix(){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int ar[][]=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        return ar;
    }
}
