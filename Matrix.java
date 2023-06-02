import java.util.Scanner;

public class Matrix {
    int arr[][];
    Matrix(int row, int col){
        arr=new int[row][col];
    }
    public void setMatrix(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println("Enter Array Elements for row "+i+" : ");
                int val=sc.nextInt();
                arr[i][j]=val;
            }
        }
        sc.close();
    }
    public void showMatrix(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public int[][] add(int arr1[][],int arr2[][]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j]+=arr2[i][j];
            }
        }
        return arr1;
    }

    public static void main(String args[]){
        int row=2;
        int col=2;
        Matrix obj=new Matrix(0,0);
        Matrix m1 = new Matrix(row,col);
        Matrix m2 = new Matrix(row,col);
        m1.setMatrix();
        m2.setMatrix();
        int ans[][]=.add(m1.arr,m2.arr);
        
    }
}
