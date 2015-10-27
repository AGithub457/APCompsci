package other;

import java.util.*;

public class Matrix {
    public static void main(String[] args){

        int matrix[][], fil, col;

        Scanner scan = new Scanner(System.in);

        show("\nType the number of rows and columns\n");
        fil = scan.nextInt();
        col = fil;

        matrix = new int[fil][col];

        show("\nCreating matrix of size "+fil+" x "+col+" ... \n");

        showMatrix(fill(matrix, scan));

        stairs(matrix);

        invertedStairs(matrix);

        n(matrix);

        z(matrix);

        s(matrix);

    }

    public static int[][] fill(int[][] a, Scanner scan){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                show("\nType the number in coordenates: "+(i+1)+", "+(j+1)+"\n");
                a[i][j] = scan.nextInt();
            }
        }
        return a;
    }

    public static void showMatrix(int[][] a){
        show("\n\nMatrix is:");
        for (int i=0; i<a.length; i++){
            show("\n");
            for (int j=0; j<a[i].length; j++){
                show(a[i][j] + " ");
            }
        }
        show("\n");
    }

    public static void stairs(int[][] a){
        show("\n\nMatrix in stairs form:");
        for (int i=0; i<a.length; i++){
            show("\n");
            for (int j=0; j<=i; j++){
                show(a[i][j] + " ");
            }
        }
        show("\n");
    }

    public static void invertedStairs(int[][] a){
        show("\n\nMatrix in inverted stairs form:");
        for (int i=0; i<a.length; i++){
            show("\n");
            for (int j=0; j<a[i].length-i; j++){
                show(a[i][j] + " ");
            }
        }
        show("\n");
    }

    public static void n(int[][] a){
        show("\n\nMatrix as an N:");
        for (int i=0; i<a.length; i++){
            show("\n");
            for (int j=0; j<a[i].length; j++){
                if(j==0){
                    show(a[i][j] + " ");
                } else if (j == (a[i].length-1)){
                    show(a[i][j] + " ");
                } else if(i == j){
                    show(a[i][j] + " ");
                } else {
                    show("  ");
                }
            }
        }
        show("\n");
    }

    public static void z(int[][] a){
        show("\n\nMatrix as a Z:");
        int x = 2;
        for (int i=0; i<a.length; i++){
            show("\n");
            for (int j=0; j<a[i].length; j++){
                if(i==0){
                    show(a[i][j] + " ");
                } else if (i == (a.length-1)){
                    show(a[i][j] + " ");
                } else if(j == (a.length-x)){
                    show(a[i][j] + " ");
                    x++;
                } else {
                    show("  ");
                }
            }
        }
        show("\n");
    }

    public static void s(int[][] a){
        show("\n\nMatrix as an S:");
        for (int i=0; i<a.length; i++){
            show("\n");
            for (int j=0; j<a[i].length; j++){
                if(i==0){
                    show(a[i][j] + " ");
                } else if (i == (a.length-1)){
                    show(a[i][j] + " ");
                } else if(i == j){
                    show(a[i][j] + " ");
                } else {
                    show("  ");
                }
            }
        }
        show("\n");
    }

    public static void show(String s){
        System.out.print(s);
    }

    public static void show(int n){
        System.out.print(n);
    }
}